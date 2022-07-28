package com.neppplus.viewpagerpractice_20220728.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpagerpractice_20220728.fragments.BirthYearFragment
import com.neppplus.viewpagerpractice_20220728.fragments.NameFragment
import com.neppplus.viewpagerpractice_20220728.fragments.PhoneFragment

class MainViewPagerAdapter(
    fm : FragmentManager
) : FragmentPagerAdapter(fm) {
//    몇 장짜리 ViewPager인지?
    override fun getCount(): Int {
        return 3
    }

//    각 페이지에는 뭐 보여줄건지?
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NameFragment()
            1 -> BirthYearFragment()
            else -> PhoneFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "이름"
            1 -> "생년"
            else -> "전화번호"
        }
    }
}