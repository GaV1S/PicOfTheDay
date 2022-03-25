package ru.gav1s.picoftheday2.ui.nav_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ru.gav1s.picoftheday2.R
import ru.gav1s.picoftheday2.databinding.BottomNavigationLayoutBinding
import ru.gav1s.picoftheday2.ui.main.MainFragment
import ru.gav1s.picoftheday2.ui.temp.CollapsingFragment

class BottomNavigationDrawerFragment : BottomSheetDialogFragment() {
    private lateinit var binding: BottomNavigationLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomNavigationLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) = with(binding) {
        super.onActivityCreated(savedInstanceState)

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_one -> {
                    Toast.makeText(context, "1", Toast.LENGTH_SHORT).show()
                    activity?.supportFragmentManager?.beginTransaction()
                        ?.replace(R.id.container, CollapsingFragment.newInstance())
                        ?.commitNow()
                }
                R.id.navigation_two -> Toast.makeText(context, "2", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}