import { faker } from '@faker-js/faker';

export const getPetData = () => {

    const pet_name = faker.name.firstName();
    const pet_id = faker.datatype.number();
    return {
        id: pet_id,
        category: {
            id: 0,
            name: 'string'
        },
        name: pet_name,
        photoUrls: [
            'string'
        ],
        tags: [
            {
                id: 0,
                name: 'string'
            }
        ],
        status: 'available'
    }
}
