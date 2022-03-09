package ru.gav1s.picoftheday2.ui.temp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.fragment.app.Fragment
import ru.gav1s.picoftheday2.databinding.CollapsingFragmentBinding

class CollapsingFragment : Fragment() {
    private lateinit var binding: CollapsingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View {
        binding = CollapsingFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = CollapsingFragment()
    }
}