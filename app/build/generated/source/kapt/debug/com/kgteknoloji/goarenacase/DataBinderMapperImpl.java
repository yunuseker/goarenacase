package com.kgteknoloji.goarenacase;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.kgteknoloji.goarenacase.databinding.ActLoginBindingImpl;
import com.kgteknoloji.goarenacase.databinding.ActMainBindingImpl;
import com.kgteknoloji.goarenacase.databinding.FrgProfileBindingImpl;
import com.kgteknoloji.goarenacase.databinding.FrgTodoBindingImpl;
import com.kgteknoloji.goarenacase.databinding.ItemTodoBindingImpl;
import com.kgteknoloji.goarenacase.databinding.ToolbarBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTLOGIN = 1;

  private static final int LAYOUT_ACTMAIN = 2;

  private static final int LAYOUT_FRGPROFILE = 3;

  private static final int LAYOUT_FRGTODO = 4;

  private static final int LAYOUT_ITEMTODO = 5;

  private static final int LAYOUT_TOOLBAR = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kgteknoloji.goarenacase.R.layout.act_login, LAYOUT_ACTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kgteknoloji.goarenacase.R.layout.act_main, LAYOUT_ACTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kgteknoloji.goarenacase.R.layout.frg_profile, LAYOUT_FRGPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kgteknoloji.goarenacase.R.layout.frg_todo, LAYOUT_FRGTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kgteknoloji.goarenacase.R.layout.item_todo, LAYOUT_ITEMTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kgteknoloji.goarenacase.R.layout.toolbar, LAYOUT_TOOLBAR);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTLOGIN: {
          if ("layout/act_login_0".equals(tag)) {
            return new ActLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for act_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTMAIN: {
          if ("layout/act_main_0".equals(tag)) {
            return new ActMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for act_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRGPROFILE: {
          if ("layout/frg_profile_0".equals(tag)) {
            return new FrgProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for frg_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRGTODO: {
          if ("layout/frg_todo_0".equals(tag)) {
            return new FrgTodoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for frg_todo is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTODO: {
          if ("layout/item_todo_0".equals(tag)) {
            return new ItemTodoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_todo is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBAR: {
          if ("layout/toolbar_0".equals(tag)) {
            return new ToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewmodel");
      sKeys.put(2, "data");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/act_login_0", com.kgteknoloji.goarenacase.R.layout.act_login);
      sKeys.put("layout/act_main_0", com.kgteknoloji.goarenacase.R.layout.act_main);
      sKeys.put("layout/frg_profile_0", com.kgteknoloji.goarenacase.R.layout.frg_profile);
      sKeys.put("layout/frg_todo_0", com.kgteknoloji.goarenacase.R.layout.frg_todo);
      sKeys.put("layout/item_todo_0", com.kgteknoloji.goarenacase.R.layout.item_todo);
      sKeys.put("layout/toolbar_0", com.kgteknoloji.goarenacase.R.layout.toolbar);
    }
  }
}
