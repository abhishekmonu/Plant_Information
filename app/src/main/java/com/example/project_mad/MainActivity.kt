package com.example.project_mad

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.MediaController
import android.widget.VideoView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview = findViewById<RecyclerView>(R.id.recyclerview)
        val videoView = findViewById<VideoView>(R.id.video)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val uri: Uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.video)

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

        recycleview.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel(R.drawable.plant1, "Tulsi","Tulsi is used to treat insect bites. Tulsi is also used to treat heart disease and fever. Tulsi is also used to treat respiratory problems. Tulsi is used to cure fever, common cold and sore throat, headaches and kidney stones."))
        data.add(ItemsViewModel(R.drawable.plant2, "Aloe Vera","Aloe vera is a medicinal plant that's been used to treat various health conditions for thousands of years. It's usually safe to use also vera directly from the plant or you can buy it in gel form. Aloe vera creams, gels, and ointments contain the clear gel found in aloe veraleaves."))
        data.add(ItemsViewModel(R.drawable.plant3, "Gotu Kola","gotu kola has also been used to treat syphilis, hepatitis, stomach ulcers, mental fatigue, epilepsy, diarrhea, fever, and asthma. Today, in the U.S. and Europe gotu kola is most often used to treat varicose veins and chronic venous insufficiency, a condition where blood pools in the legs."))
        data.add(ItemsViewModel(R.drawable.plant4, "Calendula","Calendula is a plant. The flower is used to make medicine. Calendula flower is used to prevent muscle spasms, start menstrual periods, and reduce fever. It is also used for treating sore throat and mouth, menstrual cramps, cancer, and stomach and duodenal ulcers."))
        data.add(ItemsViewModel(R.drawable.plant5, "Basil","Basil is an herb. The parts of the plant that grow above the ground are used to make medicine. Basil is used for stomach spasms, loss of appetite, intestinal gas, kidney conditions, fluid retention, head colds, warts, and worm infections. It is also used to treat snake and insect bites."))
        data.add(ItemsViewModel(R.drawable.plant6, "Thyme","The flowers, leaves, and oil are used as medicine. Thyme is sometimes used in combination with other herbs. Thyme is used for swelling (inflammation) of the main airways in the lung (bronchitis), cough, patchy hair loss (alopecia areata), stomach problems, and many other conditions."))
        data.add(ItemsViewModel(R.drawable.plant7, "Rosemary","The herb has been hailed since ancient times for its medicinal properties. Rosemary was traditionally used to help alleviate muscle pain, improve memory, boost the immune and circulatory system, and promote hair growth."))
        data.add(ItemsViewModel(R.drawable.plant8, "Lavender","Lavender is an herb. The flower and the oil of lavender are used to make medicine. Lavender is commonly used for anxiety, stress, and insomnia. It is also used for depression, dementia, pain after surgery, and many other conditions, but there is no good scientific evidence to support many of these uses."))
        data.add(ItemsViewModel(R.drawable.plant9, "German Chamomile","A form of German chamomile that can be inhaled is used to treat inflammation (swelling) and irritation of the respiratory tract and the common cold. In foods and beverages, German chamomile is used as flavoring. In manufacturing, German chamomile is used in cosmetics, soaps, and mouthwashes."))
        data.add(ItemsViewModel(R.drawable.plant10, "Fenugreek, Methi","Fenugreek is a unique herb that has long been used in alternative medicine. Based on the available evidence, fenugreek has benefits for lowering blood sugar levels, boosting testosterone, and increasing milk production in breastfeeding mothers."))
        data.add(ItemsViewModel(R.drawable.plant11, "Sage","Sage is used for digestive problems, including loss of appetite, gas (flatulence), stomach pain (gastritis), diarrhea, bloating, and heartburn. It is also used for reducing overproduction of perspiration and saliva; and for depression, memory loss, and Alzheimer's disease."))
        data.add(ItemsViewModel(R.drawable.plant12, "Peppermint","Peppermint is a popular traditional remedy for a number of conditions. It is believed to have calming effects. It is used to treat flatulence, menstrual pains, diarrhea, nausea, depression-related anxiety, muscle and nerve pain, the common cold, indigestion, and IBS."))
        data.add(ItemsViewModel(R.drawable.plant13, "Lemon Balm","Lemon balm (Melissa officinalis), a member of the mint family, is considered a calming herb. It was used as far back as the Middle Ages to reduce stress and anxiety, promote sleep, improve appetite, and ease pain and discomfort from indigestion (including gas and bloating, as well as colic)."))
        data.add(ItemsViewModel(R.drawable.plant14, "Marsh Mallow","Marshmallow leaf and root are used for pain and swelling (inflammation) of the mucous membranes that line the respiratory tract. They are also used for dry cough, inflammation of the lining of the stomach, diarrhea, stomach ulcers, constipation, urinary tract inflammation, and stones in the urinary tract."))
        data.add(ItemsViewModel(R.drawable.plant15, "Ashwangandha","Ashwagandha is an ancient medicinal herb with multiple health benefits. It can reduce anxiety and stress, help fight depression, boost fertility and testosterone in men, and even boost brain function. Supplementing with ashwagandha may be an easy and effective way to improve your health and quality of life."))
        data.add(ItemsViewModel(R.drawable.plant16, "Costus","Costus is an herb. The root and oil from the root are used to make medicine. Costus root is used for treating worm (nematode) infections. Costus oil is used for asthma, cough, gas, and severe intestinal diseases such as dysentery and cholera."))
        data.add(ItemsViewModel(R.drawable.plant17, "Sea Buckthorn","Sea buckthorn (Hippophaë) berries are widely used as traditional medicine in Asia. In Central Nepal sea buckthorn is among the medicinal plants with the widest range of uses. It is recommended for gastrointestinal disorders, coughs, and colds, as well as for menstrual disorders."))
        data.add(ItemsViewModel(R.drawable.plant18, "Tea Tree","Tea tree oil is a traditional medicine used by indigenous Australians and has been shown to have excellent activity against a range of bacteria, including methicillin-resistant Staphylococcus aureus (MRSA), yeasts, and herpes simplex virus."))


        val adapter = PlantAdapter(data)

        recycleview.adapter = adapter



    }
}