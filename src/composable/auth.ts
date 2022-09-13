import { useAuthStore } from '@/store/auth'

export const isAuthenticated = () => {
  const { user } = useAuthStore()
  return user !== null
}

export const useAuthenticate = () => {
  const { user, login } = useAuthStore()
}
