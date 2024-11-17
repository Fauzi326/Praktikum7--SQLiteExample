package muhammadfauzi.polbeng.ac.id.sqliteexample_p7

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StudentModel (
    val nim: String,
    val name: String,
    val age: String
): Parcelable