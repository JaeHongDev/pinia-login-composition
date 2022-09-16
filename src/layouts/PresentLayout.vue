<template>
  <v-app>
    <v-navigation-drawer app class="indigo text--white">
      <v-list>
        <v-list-item link
          class="vertical-nav-menu-link"
          v-bind="$attrs"
          active-class="bg-gradient-primary white--text"
        >
          <v-list-item-icon>
            <v-icon
              :class="{'alternate-icon-small': 'mdi-home'}"
              class="mx-auto"
            >
            </v-icon>
          </v-list-item-icon>

          <v-list-item-title>
            1234
          </v-list-item-title>
        </v-list-item>
      <v-list-group>
        <template #activator>
          <v-list-item-title>
            1234
          </v-list-item-title>
        </template>
        <template #prependIcon>
            <v-icon>mdi-send</v-icon>
        </template>
        <v-list-item>
          <v-list-item-icon>
            <v-icon>mdi-home</v-icon>
          </v-list-item-icon>
          <v-list-item-title>1234</v-list-item-title>
        </v-list-item>
      </v-list-group>
      </v-list>
    </v-navigation-drawer>
    <v-app-bar app class="indigo">1234</v-app-bar>
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

<style scoped lang="scss">
.app-navigation-menu {
  .v-list-item {
    padding-left: 22px;
    margin-top: 0.375rem;
    height: 44px;
    min-height: 44px;

    .v-list-item__icon {
      margin-top: 0;
      margin-bottom: 0;
      align-self: center;
    }
  }
}
.alternate-icon-small {
  font-size: 14px;
  height: 14px;
  width: 14px;
}

.vertical-nav-menu-link {
  &.v-list-item--active {
    box-shadow: 0 5px 10px -4px rgba(94, 86, 105, 0.42);
  }
}
</style>
