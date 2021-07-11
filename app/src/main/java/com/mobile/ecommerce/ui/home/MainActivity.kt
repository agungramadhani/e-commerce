package com.mobile.ecommerce.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.mobile.ecommerce.R
import com.mobile.ecommerce.databinding.ActivityMainBinding
import com.mobile.ecommerce.model.Product

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val imageList = ArrayList<SlideModel>()
    private var listProduct: ArrayList<Product> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageList.add(SlideModel(R.drawable.dummy1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.dummy2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.dummy3, ScaleTypes.FIT))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        listProduct.add(Product("Kerupuk Bantet", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fresepedia.id%2Fresep%2Fmakaroni-goreng&psig=AOvVaw2-VSb6TK6fViDWv3ZCuvJb&ust=1626119343777000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCIjAtdzk2_ECFQAAAAAdAAAAABAD",12000))
        listProduct.add(Product("Kerupuk Bantet", "https://lh3.googleusercontent.com/DtdZWIzM6qH-gTkZnWS5WmL9Zlq649kyrVVvQxaodKE6xWu849K7iUK8tCxzIQoouFy6gzcSM_tDPG8IV7y27HCNLd2WNBfWLlw8ImQetZJklHiy9Uao17FKUDLmgde8vFaJ4G4EPrc0K0WF3Xv_gswzz4ZtT8YFgR-g8A42tqxqmhcjo21OS6Y_P4l3Cf5iDy-ryjAeLd_BJagKGt3rwkdmNq-jPCMzmpxJ6oVuUHH14gpBqPGBsshzWF1iPx1ENYlnwBV2jeca9RdeNjM1h0dPWeRcrKkEUXctdNLlrqeEp1LPSwxKk-Jl1Ap_L3aWV48BK0jGwDohiZPMOFJm16PjeIczXX1vJflPKZm4Jd1fa_lU_6ksM8UYDTlY6oZh0ZeD64fKH4LV9BVLgnv2LN5tkOIbT3CyDmuPfI240hJ1lCOt4HE-Q2-aVcFmynZOhcPsjuqRh5jOttuMvc8FCJsB8khocO-rJwdfGCGcBFpLoKbnP53kj204Y_c2f8hdTs-W2-9ntTdRofo6MM7f50lqnpFsNe1LWC9m1-bKcCRfovul-nmd9JHi4ul32VvQ1mtHZ724txoZ3Rp9fdtBw3M4xKCFnaL2I1EDmZDJNcP35LL7pj7IBmsvbFNoMHJMOBRE-F95-4P41f-0Vi6V4fL4lYds7raA-Db87K5wJGTh-maLgzYh8nz0-OwMRmOnoSAKLw9C1w-9Q71RUWb36ukW=w794-h594-no?authuser=0", 10000))
        listProduct.add(Product("Makaroni Bantet","https://lh3.googleusercontent.com/_X2tGmnEkoF0Govj-SfCMQKTIwIqwWx_iSgpdc9J1uRHG1jF30VX9CuEfUfqYHBrPz3n5E5q4CkMwSMW6Lb4vL-f2GpTYevP3mcInXgY27fFBrlOodADFeEOqW9Fm8RzFYQdtWskntuwCn7_imZqg9xrxfsbnhqMpb7FDmDhPEHdLM1BmVe1TW77fu5_3cLlytlean_I1JchxRJ0j5W_25P4dt8WRJ_Uxanpscv38HXJaVzJlYffWxSbIqwWWigUyG9IzRCEnYtV-H75jCJgUKeHwM7r0DVl0S7zJxXI-4zH_i1D5kFFYpVEA20tJ0FQAtxrPcghjr0xED_IALNcudO5v5_mOu1ikuQxWE8agTLHk14U6guvALLV7dpjr7ovenDOqQVT69f1xjm-wxmZvgHJ2UXulZ5kppFbFhvR0CWEagr6cfkQcLEaHAWt0fkYYniJT32-eIWTe2Waua9zFRBC4KX3QIYbzWJMhdl4eK2phdzaL4Lo_ZOA8dxRI-rxODWvbz53WzIZrmuC_KNfQQxV957R5SaRBcOuwmH--wse0tl60_iPuwDFdHurh3XfL1Bl8VLnk303x-x2v36PZRxGJt2GlbFvYa_4DJTuKBoOncEM-pGEr0lM6Z6ZNgUSTH3kd3rIMWWkxXTHsuC27LKjlBytvFMPabWYP1zZj0LSFihLyzJBhJoZoNiFBNZ01KvoeueQjsILGiC5JPGw3Gz4=w800-h627-no?authuser=0",12000))

        setupRecyclerView(listProduct)
    }

    private fun setupRecyclerView(product: ArrayList<Product>){
        binding.rvProduct.apply {
            layoutManager = GridLayoutManager(this@MainActivity,2)
            adapter = ProductAdapter(product)
        }
    }
}