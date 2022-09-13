import { NavigationGuardNext, Route } from 'vue-router'
import { isAuthenticated } from '@/composable/auth'

/**
 * 로그인을 하지 하지않은 사용자만 접근 가능함
 * @param to
 * @param from
 * @param next
 */
export const useOnlyUnAuthenticationUserGuard = (to:Route, from: Route, next: NavigationGuardNext) => {
  console.log(isAuthenticated())
  console.log(1)
  if (isAuthenticated()) {
    next({ path: '/' })
    return
  }
  next()
}

/**
 * 로그인한 사용자만 접근 가능함
 * @param to
 * @param from
 * @param next
 */
export const useAuthenticationUserGuard = (to: Route, from: Route, next: NavigationGuardNext) => {
  if (isAuthenticated()) {
    next()
    return
  }
  console.log(isAuthenticated())
  next({ path: '/auth' })
}
