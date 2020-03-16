package com.android.example.navigation_component.feed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.example.navigation_component.R
import kotlinx.android.synthetic.main.item_boat.view.*

/**
 * A simple [Fragment] subclass.
 */
class BoatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val id = BoatFragmentArgs.fromBundle(arguments!!).id

        val boat = BOATS.getBoat(id)

        val view = inflater.inflate(R.layout.fragment_boat, container, false)
        view.nameTextView.text = boat.name
        view.locationTextView.text = boat.location
        view.imageView2.setImageResource(boat.picture)
        view.priceTextView.text = boat.price

        return view;
    }

}
