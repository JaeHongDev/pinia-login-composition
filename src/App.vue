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
import Vue, { ref } from 'vue'
import PresentLayout from '@/layouts/PresentLayout.vue'
import { isAuthenticated } from '@/composable/auth'

export default Vue.extend({
  name: 'App',
  components: { PresentLayout },
  setup: () => {
    console.log(isAuthenticated())
    const isLogin = ref(isAuthenticated())

    const login = () => {
      isLogin.value = true
    }
    const logout = () => {
      isLogin.value = false
    }
    return {
      isLogin,
      login,
      logout
    }
  }
})
</script>
