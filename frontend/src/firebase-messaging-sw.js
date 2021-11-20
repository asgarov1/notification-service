importScripts('https://www.gstatic.com/firebasejs/8.7.0/firebase-app.js')
importScripts('https://www.gstatic.com/firebasejs/8.7.0/firebase-messaging.js')

firebase.initializeApp({
  apiKey: "AIzaSyBDrufZuHRqHyiVkNSFfO2FiAQ8Gw9Ml5s",
  authDomain: "notifications-cff43.firebaseapp.com",
  projectId: "notifications-cff43",
  storageBucket: "notifications-cff43.appspot.com",
  messagingSenderId: "413708987090",
  appId: "1:413708987090:web:242fc0f0b1748494ecdb0b",
  measurementId: "G-XRV2YCYLMY"
})

const messaging = firebase.messaging();
