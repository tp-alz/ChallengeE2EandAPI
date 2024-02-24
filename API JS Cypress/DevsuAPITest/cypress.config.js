const { defineConfig } = require("cypress");

module.exports = defineConfig({
  rojectId: "ta01",
  env: {
    petStoreApiUrl: 'https://petstore.swagger.io/v2'
  },
  e2e: {
    setupNodeEvents(on, config) {
      on('task', {
        log (message) {
          console.log(message)
          return null
        }
      })
    },
  },
});
