<template>
  <div class='auth-wrapper auth-v1'>
    <div class='auth-inner'>
      <v-card class='auth-card'>
          <v-card-title>로그인</v-card-title>
        <v-card-text>
          <v-text-field label='ID' dense></v-text-field>
          <v-text-field label='PW' dense type='password'></v-text-field>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color='secondary' >로그인</v-btn>
        </v-card-actions>
      </v-card>
    </div>
  </div>
</template>

<script lang='ts'>
import Vue from 'vue'

export default Vue.extend({
  name: 'AuthPage'
})
</script>

<style scoped lang='scss'>

.auth-wrapper {
  display: flex;
  min-height: calc(var(--vh, 1vh) * 100);
  width: 100%;
  flex-basis: 100%;
  align-items: center;
  background-color:#efefef;

  &.auth-v1{
    align-items:center;
    justify-content: center;
    overflow: hidden;
    padding:1.5rem;
  }

  .auth-inner {
    width:25rem;
    z-index:1;
    .auth-card{
      padding:0.9375rem 0.875rem;
    }
  }
}
</style>
