package com.example.ilmuanislam.data;

import com.example.ilmuanislam.model.MainModel;

import java.util.ArrayList;

public class MainData {

    public static String[][] data = new String[][]{
            {"Ibnu Sina", "980 – 1037", "Ibnu Sina (980-1037) dikenal juga sebagai \"Avicenna\" di dunia Barat adalah seorang filsuf, ilmuwan, dan dokter kelahiran Persia (sekarang Iran). Ia juga seorang penulis yang produktif yang sebagian besar karyanya adalah tentang filosofi dan kedokteran. Bagi banyak orang, dia adalah \"Bapak Kedokteran Modern\". Karyanya yang sangat terkenal adalah al-Qānūn fī aṭ-Ṭibb yang merupakan rujukan di bidang kedokteran selama berabad-abad. Dia adalah pengarang dari 450 buku pada beberapa pokok bahasan besar. Banyak di antaranya memusatkan pada filosofi dan kedokteran. George Sarton menyebut Ibnu Sina \"ilmuwan paling terkenal dari mu'tazilah dan salah satu yang paling terkenal pada semua bidang, tempat dan waktu\". Karyanya yang paling terkenal adalah Kitab Penyembuhan dan Qanun Kedokteran (Al-Qanun fi At Tibb).", "https://cdn.brilio.net/news/2018/06/08/143987/780109-ilmuwan-muslim-berpengaruh.jpg"},
            {"Jabir Ibnu Hayyan", "721-815", "Jabir ialah ilmuwan dari Iran yang ahli di bidang kimia. Dia adalah orang pertama yang mengidentifikasi zat yang bisa melarutkan emas. Jabir juga orang pertama yang menemukan asam sulfat, klorida dan nitrat. Kontribusi lainnya ialah pada penemuan alkali. Karya-karya Jabir antara lain Kitab Al-Kimya, Kitab Al-Sab'een, Kitab Al Rahmah dan lain sebagainya. Kontribusi Jabir bin Hayyan yang luas terhadap perkembangan ilmu pengetahuan kimia membuatnya dijuluki sebagai Bapak Ilmu Kimia Modern.", "https://cdn.brilio.net/news/2018/06/08/143987/780110-ilmuwan-muslim-berpengaruh.jpg"},
            {"Ibnu al-Nafis", "1213 – 1288", "Ibnu al-Nafis merupakan ilmuwan dari Damaskus yang punya kontribusi besar di bidang medis. Ia merupakan ilmuwan pertama yang mengungkapkan teori pembuluh darah kapiler. Ia secara akurat dapat mendeskripsikan peredaran darah dalam tubuh. Ibnu al-Nafis sering dijuluki sebagai bapak fisiologi peredaran darah.", "https://cdn.brilio.net/news/2018/06/08/143987/786586-ilmuwan-muslim-berpengaruh.jpg"},
            {"Al-Khawrizmi", "780-850", "Al-Khawarizimi ialah ilmuwan muslim yang ahli di bidang matematika. Imuwan dari Persia ini menemukan sistem penomoran 1-10. Ia juga berjasa menemukan konsep aljabar dan algoritma.", "https://cdn.brilio.net/news/2018/06/08/143987/780114-ilmuwan-muslim-berpengaruh.jpg"},
            {"Ibnu Khaldun", "1332 – 1406", "Ibnu Khaldun ialah ilmuwan dari Tunisia yang dikenal sebagai bapak pendiri ilmu historiografi, sosiologi dan ekonomi. Karyanya yang terkenal adalam Muqaddimah. Ilmuwan ini sudah hafal Alquran sejak dini lho.", "https://cdn.brilio.net/news/2018/06/08/143987/780112-ilmuwan-muslim-berpengaruh.jpg"}

    };

    public static ArrayList<MainModel> getListData() {
        MainModel mainModel;
        ArrayList<MainModel> list = new ArrayList<>();
        for (String[] aData : data) {
            mainModel = new MainModel();
            mainModel.setName(aData[0]);
            mainModel.setYear(aData[1]);
            mainModel.setDesc(aData[2]);
            mainModel.setPhoto(aData[3]);

            list.add(mainModel);
        }

        return list;
    }
}
