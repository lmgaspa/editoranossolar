<template>
  <div>
    <Header />    
    <div class="container my-4">
      <router-view></router-view>
      <ProductList />
    </div>
    <Footer />
  </div>
</template>

<script lang="ts">
import Header from './components/NavBar.vue'
import Footer from './components/Footer.vue'

export default {
  name: 'App',
  components: {
    Header,
    Footer,
  },
}
</script>

<style>

body {
  font-family: 'Arial', sans-serif;
  margin: 0;
  padding: 0;
}

.container {
  max-width: 1200px;
}
</style>
