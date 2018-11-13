package com.wpt.yujie

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import android.support.v4.view.ViewPager



public class myPagerAdapter constructor(mpageview: ArrayList<View> ): PagerAdapter(){

    public var pageview :ArrayList<View> ?= mpageview

    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return  p0==p1
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

    override fun instantiateItem(arg0: View, arg1: Int): Any {
        (arg0 as ViewPager).addView(pageview!!.get(arg1))
        return pageview!!.get(arg1)
    }
}