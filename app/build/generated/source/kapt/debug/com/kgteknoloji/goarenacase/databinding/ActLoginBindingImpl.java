package com.kgteknoloji.goarenacase.databinding;
import com.kgteknoloji.goarenacase.R;
import com.kgteknoloji.goarenacase.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActLoginBindingImpl extends ActLoginBinding implements com.kgteknoloji.goarenacase.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_top, 5);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener tvPasswordandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.password.getValue()
            //         is viewmodel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(tvPassword);
            // localize variables for thread safety
            // viewmodel.password.getValue()
            java.lang.String viewmodelPasswordGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.password != null
            boolean viewmodelPasswordJavaLangObjectNull = false;
            // viewmodel
            com.kgteknoloji.goarenacase.viewmodel.VMLoginAct viewmodel = mViewmodel;
            // viewmodel.password
            android.arch.lifecycle.MutableLiveData<java.lang.String> viewmodelPassword = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelPassword = viewmodel.getPassword();

                viewmodelPasswordJavaLangObjectNull = (viewmodelPassword) != (null);
                if (viewmodelPasswordJavaLangObjectNull) {




                    viewmodelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener tvUsernameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.username.getValue()
            //         is viewmodel.username.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(tvUsername);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.username.getValue()
            java.lang.String viewmodelUsernameGetValue = null;
            // viewmodel.username != null
            boolean viewmodelUsernameJavaLangObjectNull = false;
            // viewmodel.username
            android.arch.lifecycle.MutableLiveData<java.lang.String> viewmodelUsername = null;
            // viewmodel
            com.kgteknoloji.goarenacase.viewmodel.VMLoginAct viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelUsername = viewmodel.getUsername();

                viewmodelUsernameJavaLangObjectNull = (viewmodelUsername) != (null);
                if (viewmodelUsernameJavaLangObjectNull) {




                    viewmodelUsername.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActLoginBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActLoginBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[3]
            , (android.support.constraint.Guideline) bindings[5]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            );
        this.btnLogin.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.prgLogin.setTag(null);
        this.tvPassword.setTag(null);
        this.tvUsername.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.kgteknoloji.goarenacase.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.kgteknoloji.goarenacase.viewmodel.VMLoginAct) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.kgteknoloji.goarenacase.viewmodel.VMLoginAct Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelUsername((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelPassword((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelProgressStatus((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelUsername(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewmodelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelPassword(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewmodelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelProgressStatus(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelProgressStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewmodelUsername = null;
        java.lang.String viewmodelPasswordGetValue = null;
        java.lang.String viewmodelUsernameGetValue = null;
        com.kgteknoloji.goarenacase.viewmodel.VMLoginAct viewmodel = mViewmodel;
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewmodelPassword = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewmodelProgressStatusGetValue = false;
        java.lang.Boolean viewmodelProgressStatusGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelProgressStatus = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.username
                        viewmodelUsername = viewmodel.getUsername();
                    }
                    updateLiveDataRegistration(0, viewmodelUsername);


                    if (viewmodelUsername != null) {
                        // read viewmodel.username.getValue()
                        viewmodelUsernameGetValue = viewmodelUsername.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.password
                        viewmodelPassword = viewmodel.getPassword();
                    }
                    updateLiveDataRegistration(1, viewmodelPassword);


                    if (viewmodelPassword != null) {
                        // read viewmodel.password.getValue()
                        viewmodelPasswordGetValue = viewmodelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.progressStatus
                        viewmodelProgressStatus = viewmodel.getProgressStatus();
                    }
                    updateLiveDataRegistration(2, viewmodelProgressStatus);


                    if (viewmodelProgressStatus != null) {
                        // read viewmodel.progressStatus.getValue()
                        viewmodelProgressStatusGetValue = viewmodelProgressStatus.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewmodel.progressStatus.getValue())
                    androidDatabindingViewDataBindingSafeUnboxViewmodelProgressStatusGetValue = android.databinding.ViewDataBinding.safeUnbox(viewmodelProgressStatusGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback1);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvPassword, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvPasswordandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvUsername, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.kgteknoloji.goarenacase.ui.bindingadapter.CommonBindingAdapter.visibilty(this.prgLogin, androidDatabindingViewDataBindingSafeUnboxViewmodelProgressStatusGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvPassword, viewmodelPasswordGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvUsername, viewmodelUsernameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.kgteknoloji.goarenacase.viewmodel.VMLoginAct viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.doLogin();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.username
        flag 1 (0x2L): viewmodel.password
        flag 2 (0x3L): viewmodel.progressStatus
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}