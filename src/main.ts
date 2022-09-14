import Vue from 'vue'
import App from './App.vue'
import router from './router'
import { createPinia, PiniaVuePlugin } from 'pinia'
import vuetify from './plugins/vuetify'
import VueRouter from 'vue-router'

Vue.use(PiniaVuePlugin)
const pinia = createPinia()

Vue.config.productionTip = false

Vue.use(VueRouter)
new Vue({
  router,
  pinia,
  vuetify,
  render: h => h(App)
}).$mount('#app')
