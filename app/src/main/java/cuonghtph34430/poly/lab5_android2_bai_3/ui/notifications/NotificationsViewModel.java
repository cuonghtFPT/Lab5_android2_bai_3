package cuonghtph34430.poly.lab5_android2_bai_3.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hình ảnh");
    }

    public LiveData<String> getText() {
        return mText;
    }
}