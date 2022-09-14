import { useAuthStore } from '@/store/auth'
export const isAuthenticated = () => {
  const store = useAuthStore()
  return store.isLoggedIn()
}

export const useAuthenticate = () => {
  const { user, login } = useAuthStore()
}
