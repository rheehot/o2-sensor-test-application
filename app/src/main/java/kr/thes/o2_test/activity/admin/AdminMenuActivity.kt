package kr.thes.o2_test.activity.admin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_admin_menu.*
import kr.thes.o2_test.R
import kr.thes.o2_test.activity.user.SetUserInformationActivity
import kr.thes.o2_test.activity.user.UserStatusActivity
import kr.thes.o2_test.utils.getSharedString
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onClick

class AdminMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_menu)
        register_admin.onClick {
            startActivity(intentFor<RegisterAdminActivity>())
        }
    }
}
