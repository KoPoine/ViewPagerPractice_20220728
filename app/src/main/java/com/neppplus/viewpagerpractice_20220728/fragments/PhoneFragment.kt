package com.neppplus.viewpagerpractice_20220728.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.viewpagerpractice_20220728.R

class PhoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_phone, container, false)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment", "onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment", "onViewCreated")
//        어댑터 등과 같은 것 View 가 필요한 것들을 초기화시켜라.
//        동작코드들은 모두 여기서 실행
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment", "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment", "onResume")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment", "onActivityCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment", "onDestroy")
    }

}