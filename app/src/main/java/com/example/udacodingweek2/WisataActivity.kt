package com.example.udacodingweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import com.example.udacodingweek2.adapter.ListViewWisata
import com.example.udacodingweek2.model.Data
import kotlinx.android.synthetic.main.activity_wisata.*

class WisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata)
        var datawisata = ArrayList<Data>()
        datawisata.add(
            Data(
                "Pulau Komodo",
                R.drawable.pulaukomodo,
                "Pulau Komodo masuk dalam kawasan Taman Nasional Komodo bersama pulau-pulau lain di sekitar Kepulauan Nusa Tenggara. Pada tahun 1986, UNESCO menetapkan tempat wisata di Indonesia ini sebagai salah satu situs warisan dunia. Pulau ini dianggap sebagai habitat binatang komodo yang wajib dilindungi. Salah satu penghargaan tertinggi yang berhasil diraih adalah berhasil masuk dalam jajaran tujuh kejaiban alam di dunia atau yang lebih dikenal dengan New Seven Wonders of Nature pada tahun 2011."

            )
        )
        datawisata.add(
            Data(
                "Raja Ampat",
                R.drawable.rajaampat,
                "Raja Ampat menjadi primadona baru di dunia pariwisata Indonesia. Pesona tempat wisata diIndonesia ini mulai banyak dikenal baik oleh wisatawan domestik maupun mancanegara."
            )
        )
        datawisata.add(
            Data(
                "Danau Santani",
                R.drawable.santani,
                "Danau Sentani disebut sebagai danau terbesar dengan di Papua. Tak mengherankan memang, karena danau ini memiliki luas sekitar 9.360 hektar dan berada di ketinggian 75 meter di atas permukaan laut. Tempat wisata di Indonesia ini dihiasi dengan 21 pulau di sekitarnya yang menjadi perkampungan warga."
            )
        )
        datawisata.add(
            Data(
                "Trio Gilli",
                R.drawable.lombok,
                "Trio Gili merupakan tiga pulau cantik yang ada di LombokKetiga pulau tersebut antara lain Gili Trawangan, Gili Meno dan Gili Air. Ketiganya tak hanya dikenal oleh wisatawan domestik, tapi juga telah berhasil mengundang banyak wisatawan mancanegara untuk datang."
            )
        )
        var adapter =ListViewWisata(this,datawisata)
        list.adapter =adapter
        list.setOnItemClickListener {parent,view,position, id ->
            val intent = Intent(this, DetailWisata::class.java)
            intent.putExtra("jdl",datawisata.get(position).nama)
            intent.putExtra("img",datawisata.get(position).photo)
            intent.putExtra("desk",datawisata.get(position).detail)
            startActivity(intent)
        }

    }
}