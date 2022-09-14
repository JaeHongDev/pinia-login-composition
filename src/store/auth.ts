import { defineStore } from 'pinia'

interface IAuth{
  id: string,
  name: string,
  managerGrade: '0' | '1' | '2'
}

interface IAuthStore {
  user : IAuth | null
}

export const useAuthStore = defineStore('auth', {

  state: () : IAuthStore => ({
    user: null
  }),
  actions: {
    login (payload:IAuth) {
      this.user = payload
    },
    logout () {
      this.user = null
    }
  },
  getters: {
    isLoggedIn: (state) => {
      return () => state.user !== null
    }
  }
})
