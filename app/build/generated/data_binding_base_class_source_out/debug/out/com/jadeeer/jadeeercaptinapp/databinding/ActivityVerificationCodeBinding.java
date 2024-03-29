// Generated by view binder compiler. Do not edit!
package com.jadeeer.jadeeercaptinapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jadeeer.jadeeercaptinapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVerificationCodeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnVerify;

  @NonNull
  public final TextView otp;

  @NonNull
  public final EditText otpBox1;

  @NonNull
  public final EditText otpBox2;

  @NonNull
  public final EditText otpBox3;

  @NonNull
  public final EditText otpBox4;

  @NonNull
  public final EditText otpBox5;

  private ActivityVerificationCodeBinding(@NonNull LinearLayout rootView, @NonNull Button btnVerify,
      @NonNull TextView otp, @NonNull EditText otpBox1, @NonNull EditText otpBox2,
      @NonNull EditText otpBox3, @NonNull EditText otpBox4, @NonNull EditText otpBox5) {
    this.rootView = rootView;
    this.btnVerify = btnVerify;
    this.otp = otp;
    this.otpBox1 = otpBox1;
    this.otpBox2 = otpBox2;
    this.otpBox3 = otpBox3;
    this.otpBox4 = otpBox4;
    this.otpBox5 = otpBox5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVerificationCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVerificationCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_verification_code, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVerificationCodeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_verify;
      Button btnVerify = ViewBindings.findChildViewById(rootView, id);
      if (btnVerify == null) {
        break missingId;
      }

      id = R.id.otp;
      TextView otp = ViewBindings.findChildViewById(rootView, id);
      if (otp == null) {
        break missingId;
      }

      id = R.id.otp_box_1;
      EditText otpBox1 = ViewBindings.findChildViewById(rootView, id);
      if (otpBox1 == null) {
        break missingId;
      }

      id = R.id.otp_box_2;
      EditText otpBox2 = ViewBindings.findChildViewById(rootView, id);
      if (otpBox2 == null) {
        break missingId;
      }

      id = R.id.otp_box_3;
      EditText otpBox3 = ViewBindings.findChildViewById(rootView, id);
      if (otpBox3 == null) {
        break missingId;
      }

      id = R.id.otp_box_4;
      EditText otpBox4 = ViewBindings.findChildViewById(rootView, id);
      if (otpBox4 == null) {
        break missingId;
      }

      id = R.id.otp_box_5;
      EditText otpBox5 = ViewBindings.findChildViewById(rootView, id);
      if (otpBox5 == null) {
        break missingId;
      }

      return new ActivityVerificationCodeBinding((LinearLayout) rootView, btnVerify, otp, otpBox1,
          otpBox2, otpBox3, otpBox4, otpBox5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
