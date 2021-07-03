package k12tt.luongvany.verysimpleproject.giuaki.model

object UserSingleTon {
    private var users: MutableList<User> = mutableListOf()

    fun getUsers() = users

}
