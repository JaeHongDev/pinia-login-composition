<template>
  <v-app>
    <v-navigation-drawer app>
    </v-navigation-drawer>
    <v-app-bar app>1234</v-app-bar>
    <v-main>
      <v-container fluid>
        <slot></slot>
      </v-container>
    </v-main>
    <v-footer></v-footer>
  </v-app>
</template>

<script>
export default {
  name: 'PresentLayout'
}
</script>

<style scoped>

</style>
