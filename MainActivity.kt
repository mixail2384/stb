import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class ArticleActivity : AppCompatActivity() {
    private lateinit var likeButton: Button
    private lateinit var dislikeButton: Button
    private lateinit var likeCountTextView: TextView
    private lateinit var dislikeCountTextView: TextView

    private var likeCount = 0
    private var dislikeCount = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.article_layout)

        // Находим вьюшки по ID
        likeButton = findViewById(R.id.likeButton)
        dislikeButton = findViewById(R.id.dislikeButton)
        likeCountTextView = findViewById(R.id.likeCountTextView)
        dislikeCountTextView = findViewById(R.id.dislikeCountTextView)

        // Устанавливаем слушатели для кнопок
        likeButton.setOnClickListener {
            likeCount++
            updateLikeCount()
        }

        dislikeButton.setOnClickListener {
            dislikeCount++
            updateDislikeCount()
        }
    }

    private fun updateLikeCount() {
        likeCountTextView.text = "$likeCount Likes"
    }

    private fun updateDislikeCount() {
        dislikeCountTextView.text = "$dislikeCount Dislikes"
    }
}
