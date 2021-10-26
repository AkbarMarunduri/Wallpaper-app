package com.akbarmarunduri.walpaperapps.fragments.walpapers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.akbarmarunduri.walpaperapps.databinding.FragmentWallpapersBinding

class WallpapersFragment : Fragment() {

    private var mBinding: FragmentWallpapersBinding? = null

    private val binding get() = requireNotNull(mBinding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (mBinding == null) {
            mBinding=FragmentWallpapersBinding.inflate(inflater,container,false)
            init()
        }
        return binding.root
    }

    private fun init() {
       setListener()
    }

    private fun setListener() {
        /*
        karena menggunakan navigation componen pada project ini maka "WallpapersFragmentDirections"
        class digeneret secara otomatis dari "WallpaperFragment" , gunakan class direction tersebut
        untuk menentukan action yang sudah kamu buat di "navigation_graph.xml" sebelumnya.
         */
        binding.imageSearch.setOnClickListener{
            findNavController().navigate(
                WallpapersFragmentDirections.actionWalpapersFragmentToSearchFragment()
            )
        }
    }

}