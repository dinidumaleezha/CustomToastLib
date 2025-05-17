package com.maleezha.customtoastlib;

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

//ToastUtil.success(this, "Saved successfully!");
//ToastUtil.error(this, "Something went wrong.");
//ToastUtil.warning(this, "Check your input.");
//ToastUtil.info(this, "Updates are available.");
//ToastUtil.custom(this, "Custom style!", R.drawable.custom_icon);
//ToastUtil.custom(this, "Custom style!", R.drawable.custom_icon, R.color.primaryColor);


    // ✅ Common method for displaying the toast
    private static void show(Context context, String message, int iconResId, int bgColorResId) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View layout = inflater.inflate(R.layout.custom_toast, null);

        TextView text = layout.findViewById(R.id.toast_text);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        RelativeLayout methodColor = layout.findViewById(R.id.methodColor);

        text.setText(message);
        icon.setImageResource(iconResId);
        methodColor.setBackgroundColor(ContextCompat.getColor(context, bgColorResId));

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 100);
        toast.show();
    }

    // ✅ Success toast
    public static void success(Context context, String message) {
        show(context, message, R.drawable.success_icon, R.color.successColor); // replace with your success icon
    }

    // ✅ Error toast
    public static void error(Context context, String message) {
        show(context, message, R.drawable.error_icon, R.color.errorColor); // replace with your error icon
    }

    // ✅ Warning toast
    public static void warning(Context context, String message) {
        show(context, message, R.drawable.warning_icon, R.color.warningColor); // replace with your warning icon
    }

    // ✅ Info toast
    public static void info(Context context, String message) {
        show(context, message, R.drawable.info_icon, R.color.infoColor); // replace with your info icon
    }

    // ✅ If custom needed
    public static void custom(Context context, String message, int iconResId, int bgColorResId) {
        show(context, message, iconResId, bgColorResId);
    }
}
