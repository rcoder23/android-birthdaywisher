package fritprfojects.example.birthdaywhisher

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.birthdaycreateactivity.*

class BirthdayCreateActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.birthdaycreateactivity)

        val name=intent.getStringExtra("name")
        birthGreeting.text = "Happy Birthday $name"
        val rnds=(0 .. 10).random()
        if(rnds==0){
            Wishes.text="My wishes for you on your birthday is that you are , and will always be ,happy and healthy $name"
        }
        else if(rnds==1){
            Wishes.text="Have a wonderful , happy ,healthy birthday now and forever $name"
        }
        else if(rnds==2){
            Wishes.text = "Happy birthday to person that's charming, talented , and witty, and reminds me a lot of myself $name"
        }
        else if(rnds==3){
            Wishes.text="You always bring a sweet smile to my face ! Happy birthday $name"
        }
        else if(rnds==4){
            Wishes.text="Forget the past ;look forward to the future , for the best things are yet to come! Happy birthday $name"
        }
        else if(rnds==5){
            Wishes.text="I hope that your birthday is as much fun as you are, but that sets a very high standards ! happy birthday $name"
        }
        else if(rnds==6){
            Wishes.text="Dont't worry about the furture , I'm sure you will have a bright one . Don't worry about the past, you can't change it.Dont; woory Abut future ,i don't have one for you ! $name"
        }
        else if(rnds==7){
            Wishes.text="Happy birthday . You make every day great full $name"
        }
        else if(rnds==8){
            Wishes.text="Congratulations on your birthday ! Wishing you a truely fabulous day $name"
        }
        else if(rnds==9){
            Wishes.text="Warmest wishes for your  happy birthday $name"
        }
        else{
            Wishes.text="Happy birthday ! I hope you have wonderful day and that the year ahead is full of fun and adventure $name"

        }



        btnShare.setOnClickListener{

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            val message :String = Wishes.text.toString()
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent,"Share to :"))

        }
    }

}