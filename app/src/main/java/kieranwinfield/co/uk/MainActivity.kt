package kieranwinfield.co.uk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: ActionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!
        var bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)

        val rollButton = findViewById<Button>(R.id.RollButton)
        val resultTextView = findViewById<TextView>(R.id.ResultsTextView)
        val numberOfTimesSeekBar = findViewById<SeekBar>(R.id.NumberOfRollsSeekBar)
        val DieType = findViewById<SeekBar>(R.id.DiceYouAreRollingSeekBar)

        //Roll when the Button is pressed
        rollButton.setOnClickListener{
            //D4
            if (DieType.progress == 0) {
                val rand1 = Random.nextInt(1,5)
                resultTextView.text = rand1.toString()
                if (numberOfTimesSeekBar.progress == 1) {
                    val rand2 = Random.nextInt(1, 5)
                    resultTextView.text = rand1.toString() + ',' + rand2.toString()
                }
            }
            //D6
            if (DieType.progress == 1) {
                val rand1 = Random.nextInt(1,7)
                resultTextView.text = rand1.toString()
                if (numberOfTimesSeekBar.progress == 1) {
                    val rand2 = Random.nextInt(1, 7)
                    resultTextView.text = rand1.toString() + ',' + rand2.toString()
                }
            }
            //D8
            if (DieType.progress == 2) {
                val rand1 = Random.nextInt(1,9)
                resultTextView.text = rand1.toString()
                if (numberOfTimesSeekBar.progress == 1) {
                    val rand2 = Random.nextInt(1, 9)
                    resultTextView.text = rand1.toString() + ',' + rand2.toString()
                }
            }
            //D10
            if (DieType.progress == 3) {
                val rand1 = Random.nextInt(1,11)
                resultTextView.text = rand1.toString()
                if (numberOfTimesSeekBar.progress == 1) {
                    val rand2 = Random.nextInt(1, 11)
                    resultTextView.text = rand1.toString() + ',' + rand2.toString()
                }
            }
            //D12
            if (DieType.progress == 4) {
                val rand1 = Random.nextInt(1, 13)
                resultTextView.text = rand1.toString()
                if (numberOfTimesSeekBar.progress == 1) {
                    val rand2 = Random.nextInt(1, 13)
                    resultTextView.text = rand1.toString() + ',' + rand2.toString()
                }
            }
            //D20
            if (DieType.progress == 5) {
                val rand1 = Random.nextInt(1,21)
                resultTextView.text = rand1.toString()
                if (numberOfTimesSeekBar.progress == 1) {
                    val rand2 = Random.nextInt(1, 21)
                    resultTextView.text = rand1.toString() + ',' + rand2.toString()
                }
            }
        }
    }
}
