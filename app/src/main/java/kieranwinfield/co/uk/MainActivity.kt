package kieranwinfield.co.uk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.RollButton)
        val resultTextView = findViewById<TextView>(R.id.ResultsTextView)
        val numberOfTimesSeekBar = findViewById<SeekBar>(R.id.NumberOfRollsSeekBar)
        val DieType = findViewById<SeekBar>(R.id.DiceYouAreRollingSeekBar)
        var x = 0

        //Roll when the Button is pressed
        rollButton.setOnClickListener() {

                //D4
                if (DieType.progress == 0) {
                    val rand = Random.nextInt(4)
                    resultTextView.text = rand.toString()
                    if (numberOfTimesSeekBar.progress == 1){
                        resultTextView.text = rand.toString()
                    }
                }
                //D6
                if (DieType.progress == 1) {
                    val rand = Random.nextInt(6)
                    resultTextView.text = rand.toString()
                }
                //D8
                if (DieType.progress == 2) {
                    val rand = Random.nextInt(8)
                    resultTextView.text = rand.toString()
                }
                //D10
                if (DieType.progress == 3) {
                    val rand = Random.nextInt(10)
                    resultTextView.text = rand.toString()
                }
                //D12
                if (DieType.progress == 4) {
                    val rand = Random.nextInt(12)
                    resultTextView.text = rand.toString()
                }
                //D20
                if (DieType.progress == 5) {
                    val rand = Random.nextInt(20)
                    resultTextView.text = rand.toString()
                }
        }
    }
