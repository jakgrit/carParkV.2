package buu.informatics.s59160002.carparkwithlogin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160002.carparkwithlogin.databinding.FragmentCarparkBinding

/**
 * A simple [Fragment] subclass.
 */
class CarParkFragment : Fragment() {

    private var car1: Car = Car()
    private var car2: Car = Car()
    private var car3: Car = Car()

    private var obj: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentCarparkBinding>(inflater, R.layout.fragment_carpark, container, false)

        binding.apply {
            slt1.setOnClickListener { selectItem(binding, "1") }
            slt2.setOnClickListener { selectItem(binding, "2") }
            slt3.setOnClickListener { selectItem(binding, "3") }

            saveBtn.setOnClickListener { initValue(binding, obj) }
        }

        hideComponent(binding)

        return binding.root
    }

    private fun hideComponent(fragment: FragmentCarparkBinding){
        fragment.apply {

            deleteBtn.visibility = View.INVISIBLE
            saveBtn.visibility = View.INVISIBLE
            carIdTxt.visibility = View.INVISIBLE
            firstNameTxt.visibility = View.INVISIBLE
            lastNameTxt.visibility = View.INVISIBLE
        }
    }

    private fun selectItem(fragment:FragmentCarparkBinding , slot: String){
        fragment.apply {
            deleteBtn.visibility = View.VISIBLE
            saveBtn.visibility = View.VISIBLE
            carIdTxt.visibility = View.VISIBLE
            firstNameTxt.visibility = View.VISIBLE
            lastNameTxt.visibility = View.VISIBLE

            saveBtn.setOnClickListener { initValue(fragment, slot) }
            deleteBtn.setOnClickListener { removeObj(fragment, slot) }
        }

        obj = slot

        if (slot.equals("1")){
            showText(fragment, car1)
        }else if(slot.equals("2")){
            showText(fragment, car2)
        }else{
            showText(fragment, car3)
        }
    }

    //Initial Value
    private fun initValue(binding: FragmentCarparkBinding, slt: String){

        var car: Car = Car()

        val carId = binding.carIdTxt
        val firstName = binding.firstNameTxt
        val lastName = binding.lastNameTxt

        if(carId.text.toString() != "" && firstName.text.toString() != "" && lastName.text.toString() != ""){
            car.carId = carId.text.toString()
            car.firstName = firstName.text.toString()
            car.lastName = lastName.text.toString()
        }

        when (slt) {
            "1" -> {
                car1 = car
                Toast.makeText(activity, slt + car1.firstName, Toast.LENGTH_SHORT).show()
            }
            "2" -> {

                car2 = car
                Toast.makeText(activity, slt + car2.firstName, Toast.LENGTH_SHORT).show()
            }
            "3" -> {

                car3 = car
                Toast.makeText(activity, slt + car3.firstName, Toast.LENGTH_SHORT).show()
            }
        }

        hideComponent(binding)

    }

    private fun removeObj(binding: FragmentCarparkBinding, slt: String){
        var car: Car = Car()

        car.carId = ""
        car.firstName = ""
        car.lastName = ""

        when (slt){
            "1" ->{
                car1 = car
                showText(binding, car1)
            }
            "2" ->{
                car2 = car
                showText(binding, car2)
            }
            else ->{
                car3 = car
                showText(binding, car3)
            }
        }
    }

    //showValue
    private fun showText(binding: FragmentCarparkBinding, obj: Car){

        binding.carIdTxt.setText(obj.carId)
        binding.firstNameTxt.setText(obj.firstName)
        binding.lastNameTxt.setText(obj.lastName)

    }
}
