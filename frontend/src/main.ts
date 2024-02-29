import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import ToastPlugin from 'vue-toast-notification';

import "bootstrap/dist/css/bootstrap.css"
import "bootstrap/dist/js/bootstrap.js"
import 'bootstrap-icons/font/bootstrap-icons.css'
import 'vue-toast-notification/dist/theme-bootstrap.css';

const app = createApp(App)

app.use(router).use(ToastPlugin)

app.mount('#app')
