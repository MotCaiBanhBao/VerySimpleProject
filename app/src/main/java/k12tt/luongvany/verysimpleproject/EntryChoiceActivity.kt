package k12tt.luongvany.verysimpleproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import k12tt.luongvany.verysimpleproject.bai1linearlayout.Bai1Activity
import k12tt.luongvany.verysimpleproject.bai2.LoginActivity
import k12tt.luongvany.verysimpleproject.giuaki.WelcomeActivity

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return listOf(
            Choice(
                "Bài 1",
                "Tạo một giao diện linearlayout đơn giản.",
                Intent(this, Bai1Activity::class.java)
            ),
            Choice(
                "Bài 2",
                "Làm 2 màn hình: 1. Màn hình login, nhập user, password, nút đăng nhập để chuyển qua màn hình 2, nút Hủy để xóa text đã nhập ở 2 edittext user và pass; \n" +
                        "2. Màn hình 2 hiện thông tin user pass đã nhập và có nút Đăng xuất để quay về màn hình 1.",
                Intent(this, LoginActivity::class.java)),
            Choice(
                "Giữa kì",
                "Bài tập báo cáo giữa kì:\n" +
                        "1. Màn hình sign Up\n" +
                        "2. Màn hình login \n" +
                        "3. Màn hình list view ",
                Intent(this, WelcomeActivity::class.java))
        )
    }
}