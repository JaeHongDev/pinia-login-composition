import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import { useAuthenticationUserGuard, useOnlyUnAuthenticationUserGuard } from '@/router/auth'
import AuthPage from '@/pages/AuthPage.vue'
import MainPage from '@/pages/MainPage.vue'
Vue.use(VueRouter)
const routes: Array<RouteConfig> = [
  {
    path: '/',
    name: 'home',
    component: MainPage,
    beforeEnter: useAuthenticationUserGuard
  },
  {
    path: '/auth',
    name: 'auth',
    component: AuthPage,
    beforeEnter: useOnlyUnAuthenticationUserGuard
  },
  {
    path: '/test',
    name: 'test',
    component: AuthPage,
    beforeEnter: (to, from, next) => {
      console.log(1)
    }
  }
]
const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
