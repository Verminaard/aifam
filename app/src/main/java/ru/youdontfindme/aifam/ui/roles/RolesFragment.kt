package ru.youdontfindme.aifam.ui.roles

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.youdontfindme.aifam.R

class RolesFragment : Fragment() {

    companion object {
        fun newInstance() = RolesFragment()
    }

    private lateinit var viewModel: RolesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_roles, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RolesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}