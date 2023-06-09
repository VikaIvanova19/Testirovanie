// Generated by view binder compiler. Do not edit!
package com.example.flowers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flowers.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainOneBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView sectionLabel;

  private FragmentMainOneBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView,
      @NonNull TextView sectionLabel) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.imageView = imageView;
    this.sectionLabel = sectionLabel;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainOneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainOneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main_one, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainOneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout constraintLayout = (ConstraintLayout) rootView;

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.section_label;
      TextView sectionLabel = ViewBindings.findChildViewById(rootView, id);
      if (sectionLabel == null) {
        break missingId;
      }

      return new FragmentMainOneBinding((ConstraintLayout) rootView, constraintLayout, imageView,
          sectionLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
