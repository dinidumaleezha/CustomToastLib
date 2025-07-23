# 🍞 CustomToastLib

A lightweight and customizable Android Toast library for displaying stylish toasts with icons and messages. Developed with ❤️ by [Dinidu Maleezha](https://github.com/dinidumaleezha).

---

## 📦 Installation

Add the following to your project-level `build.gradle`:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Then, add this to your app-level `build.gradle` dependencies:

```gradle
dependencies {
    implementation 'com.github.dinidumaleezha:CustomToastLib:v1.1.1'
}
```

---

## ⚙️ Usage

`Success Toast`
```java
ToastUtil.success(this, "Data saved successfully!");
```
`Error Toast`
```java
ToastUtil.error(this, "Failed to load data!");
```
`Warning Toast`
```java
ToastUtil.warning(this, "Please check your input!");
```
`Info Toast`
```java
ToastUtil.info(this, "New update available.");
```
`Custom Toast`
```java
ToastUtil.custom(this, "Stylish!", R.drawable.custom_icon, R.color.customColor);
```
`Custom Toast`
```java
ToastUtil.custom(this, "Short custom!", R.drawable.custom_icon, R.color.customColor, Toast.LENGTH_SHORT);
```

You can call this from your `Activity` or `Fragment`.

---

## 🎥 Demo Video
[![Watch the video](https://github.com/dinidumaleezha/CustomToastLib/raw/main/assets/preview-video.png)](https://github.com/dinidumaleezha/CustomToastLib/raw/main/assets/demo.mp4)

---

## 📁 Features

- ✅ Easy integration
- 🎨 Custom layout with icon and message
- ☕ Lightweight & clean
- 💡 Ideal for success, error, warning, and info messages

---

## 📄 License

```
MIT License

Copyright (c) 2025 Dinidu

Permission is hereby granted, free of charge, to any person obtaining a copy...
```

---

## 🙌 Credits

Created and maintained by **Dinidu Maleezha**.  
Feel free to contribute or star ⭐ the repository!
