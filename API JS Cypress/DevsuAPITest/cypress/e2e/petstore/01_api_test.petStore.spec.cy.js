
import { getPetData } from "../../helpers/dataGenerator";
import { addPet, getPetByID, getPetByStatus, udpatePet } from "../../service/petService";

var petData1 = getPetData();
var petData2 = getPetData();

describe('Add new pet', () => {
    it('Positive: Create a pet with all required fields', () => {
        cy.task('log', petData1);
        addPet(petData1).then(response => {
            expect(response.status).to.eq(200);
            expect(response.body).to.have.property('name', petData1.name);
            expect(response.body).to.have.property('status', petData1.status);
        })
    })
})

describe('Find pet by ID', () => {
    it('Positive: Get a pet with valid id', () => {
        getPetByID(petData1.id).then(response => {
            expect(response.status).to.eq(200);
            expect(response.body).to.have.property('name', petData1.name);
            expect(response.body).to.have.property('status', petData1.status);
        })
    })
})

describe('Update pet name and status to "sold"', () => {
    it('Positive: Update with valid name and status', () => {
        petData1.name = petData2.name
        petData1.status = 'sold'
        cy.task('log', petData1);
        udpatePet(petData1).then(response => {
            expect(response.status).to.eq(200);
            expect(response.body).to.have.property('name', petData2.name);
            expect(response.body).to.have.property('status', 'sold');
        })
    })
})

describe('Find pet by Status', () => {
    it.skip('Positive: Get pet with expected "sold" status', () => {
        getPetByStatus(petData1.status).then(response => {
            expect(response.status).to.eq(200);
            expect(response.body).to.be.an('array');
            const foundObject = response.body.find((item) => 
            item.hasOwnProperty('id') && item['id'] === petData1.id);
            expect(foundObject).to.exist;
            
        })
    })
})
