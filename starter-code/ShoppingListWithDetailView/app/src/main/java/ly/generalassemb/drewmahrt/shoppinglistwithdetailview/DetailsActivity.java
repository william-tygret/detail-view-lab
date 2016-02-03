package ly.generalassemb.drewmahrt.shoppinglistwithdetailview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int id = getIntent().getIntExtra("id", -1);
        if(id >= 0){
            String name = ShoppingSQLiteOpenHelper.getInstance(DetailsActivity.this).getItemName(id);
            TextView textView = (TextView)findViewById(R.id.details_text);
            textView.setText(name);
        }
        if(id >= 0){
            String description = ShoppingSQLiteOpenHelper.getInstance(DetailsActivity.this).getItemDescription(id);
            TextView textView = (TextView)findViewById(R.id.description_text);
            textView.setText(description);
        }
        if(id >= 0){
            String price = ShoppingSQLiteOpenHelper.getInstance(DetailsActivity.this).getItemPrice(id);
            TextView textView = (TextView)findViewById(R.id.price_text);
            textView.setText("$"+price);
        }
        if(id >= 0){
            String type = ShoppingSQLiteOpenHelper.getInstance(DetailsActivity.this).getItemType(id);
            TextView textView = (TextView)findViewById(R.id.type_text);
            textView.setText(type);
        }
    }
}
