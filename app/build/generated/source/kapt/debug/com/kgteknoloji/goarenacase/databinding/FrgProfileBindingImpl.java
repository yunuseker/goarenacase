package com.kgteknoloji.goarenacase.databinding;
import com.kgteknoloji.goarenacase.R;
import com.kgteknoloji.goarenacase.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrgProfileBindingImpl extends FrgProfileBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.btn_back, 4);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FrgProfileBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FrgProfileBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[4]
            , (android.support.v7.widget.Toolbar) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmail.setTag(null);
        this.tvUsername.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewmodel((com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelProfileData((android.arch.lifecycle.MutableLiveData<com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelProfileData(android.arch.lifecycle.MutableLiveData<com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity> ViewmodelProfileData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewmodelProfileDataName = null;
        java.lang.String viewmodelProfileDataEmail = null;
        com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg viewmodel = mViewmodel;
        com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity viewmodelProfileDataGetValue = null;
        android.arch.lifecycle.MutableLiveData<com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity> viewmodelProfileData = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.profileData
                    viewmodelProfileData = viewmodel.getProfileData();
                }
                updateLiveDataRegistration(0, viewmodelProfileData);


                if (viewmodelProfileData != null) {
                    // read viewmodel.profileData.getValue()
                    viewmodelProfileDataGetValue = viewmodelProfileData.getValue();
                }


                if (viewmodelProfileDataGetValue != null) {
                    // read viewmodel.profileData.getValue().name
                    viewmodelProfileDataName = viewmodelProfileDataGetValue.getName();
                    // read viewmodel.profileData.getValue().email
                    viewmodelProfileDataEmail = viewmodelProfileDataGetValue.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, viewmodelProfileDataEmail);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvUsername, viewmodelProfileDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.profileData
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}