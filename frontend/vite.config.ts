import {fileURLToPath, URL} from 'node:url'

import {defineConfig} from 'vite'
import Vue from '@vitejs/plugin-vue'
import Markdown from 'vite-plugin-vue-markdown'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    Vue({
      include: [/\.vue$/, /\.md$/]
    }),
    Markdown()
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  server: {
    proxy: {
      '/api': {
        target: 'http://localhost:8080',
        changeOrigin: true,
        secure: false
      }, '/logout': {
        target: 'http://localhost:8080',
        hostRewrite: 'http://localhost:8080',
        changeOrigin: true,
        secure: false
      }, '/login': {
        target: 'http://localhost:8080',
        hostRewrite: 'http://localhost:8080',
        changeOrigin: true,
        secure: false
      }, '/authorization/google': {
        target: 'http://localhost:8080',
        hostRewrite: 'http://localhost:8080',
        changeOrigin: true,
        secure: false
      }
    }
  }
})
