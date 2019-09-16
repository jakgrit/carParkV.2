package buu.informatics.s59160002.carparkwithlogin


import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160002.carparkwithlogin.databinding.FragmentCarparkBinding

/**
 * A simple [Fragment] subclass.
 */
class CarParkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentCarparkBinding>(inflater, R.layout.fragment_carpark, container, false)

        return binding.root
    }


}
