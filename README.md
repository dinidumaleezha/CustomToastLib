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
    implementation 'com.github.dinidumaleezha:CustomToastLib:v1.0.0'
}
```

---

## ⚙️ Usage

```java
ToastUtil.showCustomToast(
    context,
    "Custom toast shown!",
    R.drawable.done_success_icon
);
```

You can call this from your `Activity` or `Fragment`.

---

## 🖼️ Preview

![Custom Toast Preview](https://github.com/dinidumaleezha/CustomToastLib/assets/example-toast-preview.png)

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