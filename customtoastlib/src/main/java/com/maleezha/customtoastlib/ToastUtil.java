package com.maleezha.customtoastlib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class ToastUtil {
//ToastUtil.success(this, "Data saved successfully!");
//ToastUtil.error(this, "Failed to load data!");
//ToastUtil.warning(this, "Please check your input!");
//ToastUtil.info(this, "New update available.");
//ToastUtil.custom(this, "Stylish!", R.drawable.custom_icon, R.color.customColor);
//ToastUtil.custom(this, "Short custom!", R.drawable.custom_icon, R.color.customColor, Toast.LENGTH_SHORT);

    // 🔁 Internal reusable method
    private static void show(Context context, String message, int iconResId, int bgColorResId, int duration) {
        if (context == null || message == null) return;

        @SuppressLint("InflateParams")
        View layout = LayoutInflater.from(context).inflate(R.layout.custom_toast_v2, null);

        TextView text = layout.findViewById(R.id.toast_text);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        RelativeLayout background = layout.findViewById(R.id.methodColor);

        text.setText(message);
        icon.setImageResource(iconResId);
        background.setBackgroundColor(ContextCompat.getColor(context, bgColorResId));

        Toast toast = new Toast(context.getApplicationContext());
        toast.setView(layout);
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 100);
        toast.show();
    }

    // ✅ Success toast
    public static void success(Context context, String message) {
        show(context, message, R.drawable.success_icon, R.color.successColor, Toast.LENGTH_LONG);
    }

    // ✅ Error toast
    public static void error(Context context, String message) {
        show(context, message, R.drawable.error_icon, R.color.errorColor, Toast.LENGTH_LONG);
    }

    // ✅ Warning toast
    public static void warning(Context context, String message) {
        show(context, message, R.drawable.warning_icon, R.color.warningColor, Toast.LENGTH_LONG);
    }

    // ✅ Info toast
    public static void info(Context context, String message) {
        show(context, message, R.drawable.info_icon, R.color.infoColor, Toast.LENGTH_LONG);
    }

    // ✅ Fully customizable toast
    public static void custom(Context context, String message, int iconResId, int bgColorResId) {
        show(context, message, iconResId, bgColorResId, Toast.LENGTH_LONG);
    }

    // ✅ Custom with duration control
    public static void customDurationControl(Context context, String message, int iconResId, int bgColorResId, int duration) {
        show(context, message, iconResId, bgColorResId, duration);
    }
}
