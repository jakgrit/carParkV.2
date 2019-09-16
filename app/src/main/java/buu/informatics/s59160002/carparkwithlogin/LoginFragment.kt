package buu.informatics.s59160002.carparkwithlogin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160002.carparkwithlogin.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)

        binding.loginBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment2_to_carParkFragment2)
        }

        return binding.root
    }


}
