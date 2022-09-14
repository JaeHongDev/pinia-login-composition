<template>
  <div>
    <v-btn @click='login'>로그인</v-btn>
    <v-btn @click='logout'>로그아웃</v-btn>
    <present-layout v-if='isLogin'>
      <router-view></router-view>
    </present-layout>
    <v-app v-else>
      <router-view></router-view>
    </v-app>
  </div>
</template>

<script lang="ts">
import Vue, { ref, watch } from 'vue'
import PresentLayout from '@/layouts/PresentLayout.vue'
import { isAuthenticated } from '@/composable/auth'
import { useAuthStore } from '@/store/auth'
import { useRouter } from 'vue-router/composables'

export default Vue.extend({
  name: 'App',
  components: { PresentLayout },
  setup: () => {
    const authStore = useAuthStore()
    const router = useRouter()
    watch(() => authStore.user, () => {
      isLogin.value = authStore.isLoggedIn()
    })
    const isLogin = ref(authStore.isLoggedIn())

    const login = () => {
      authStore.login({
        id: '',
        name: '',
        managerGrade: '0'
      })
      router.push('/')
    }
    const logout = () => {
      authStore.logout()
    }
    return {
      isLogin,
      login,
      logout
    }
  }
})
</script>
