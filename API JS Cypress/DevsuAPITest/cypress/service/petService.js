import { API_URL } from "./apiSettings";

export const addPet = (body, autoControl = true) => {
    return cy.request({
        method: 'POST',
        url: `${API_URL}/pet`,
        body: body,
        failOnStatusCode: autoControl,
    })//.then(({body}) => {
        //Cypress.env('responses').push(body);
    //})
}


export const getPetByID = (ID, autoControl = true) => {
    return cy.request({
        method: 'GET',
        url: `${API_URL}/pet/${ID}`,
        failOnStatusCode: autoControl,
    })
}


export const udpatePet = (body, autoControl = true) => {
    return cy.request({
        method: 'PUT',
        url: `${API_URL}/pet`,
        body: body,
        failOnStatusCode: autoControl,
    })
}
 
export const getPetByStatus = (status, autoControl = true) => {
    return cy.request({
        method: 'GET',
        url: `${API_URL}/pet/findByStatus?status=${status}`,
        failOnStatusCode: autoControl,
    }).then(({body}) => {
        Cypress.env('responses').push(body);
    })
}