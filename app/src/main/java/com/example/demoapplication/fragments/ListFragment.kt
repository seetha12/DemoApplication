package com.example.demoapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demoapplication.R
import com.example.demoapplication.service.model.User
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_add_user.setOnClickListener {
            val user = User(null, "srilakshmi.chakkapalli@gmail.com", "Seetha", "Chakkapalli", null, null)
            val bundle = Bundle()
            bundle.putParcelable("user", user)
            findNavController().navigate(R.id.detailsFragment, bundle)
        }
    }
}