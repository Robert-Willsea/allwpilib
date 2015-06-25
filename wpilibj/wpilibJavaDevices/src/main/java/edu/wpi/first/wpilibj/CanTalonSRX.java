/*
 * ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org). Version
 * 2.0.11
 *$
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * -----------------------------------------------------------------------------
 */

package edu.wpi.first.wpilibj.hal;

public class CanTalonSRX extends CtreCanNode {
  private long swigCPtr;

  protected CanTalonSRX(long cPtr, boolean cMemoryOwn) {
    super(CanTalonJNI.CanTalonSRX_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CanTalonSRX obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CanTalonJNI.delete_CanTalonSRX(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CanTalonSRX(int deviceNumber, int controlPeriodMs) {
    this(CanTalonJNI.new_CanTalonSRX__SWIG_0(deviceNumber, controlPeriodMs), true);
  }

  public CanTalonSRX(int deviceNumber) {
    this(CanTalonJNI.new_CanTalonSRX__SWIG_1(deviceNumber), true);
  }

  public CanTalonSRX() {
    this(CanTalonJNI.new_CanTalonSRX__SWIG_2(), true);
  }

  public void Set(double value) {
    CanTalonJNI.CanTalonSRX_Set(swigCPtr, this, value);
  }

  public SWIGTYPE_p_CTR_Code SetParam(CanTalonSRX.param_t paramEnum, double value) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetParam(swigCPtr, this,
        paramEnum.swigValue(), value), true);
  }

  public SWIGTYPE_p_CTR_Code RequestParam(CanTalonSRX.param_t paramEnum) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_RequestParam(swigCPtr, this,
        paramEnum.swigValue()), true);
  }

  public SWIGTYPE_p_CTR_Code GetParamResponse(CanTalonSRX.param_t paramEnum, SWIGTYPE_p_double value) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetParamResponse(swigCPtr, this,
        paramEnum.swigValue(), SWIGTYPE_p_double.getCPtr(value)), true);
  }

  public SWIGTYPE_p_CTR_Code GetParamResponseInt32(CanTalonSRX.param_t paramEnum,
      SWIGTYPE_p_int value) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetParamResponseInt32(swigCPtr, this,
        paramEnum.swigValue(), SWIGTYPE_p_int.getCPtr(value)), true);
  }

  public SWIGTYPE_p_CTR_Code SetPgain(long slotIdx, double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetPgain(swigCPtr, this, slotIdx, gain),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetIgain(long slotIdx, double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetIgain(swigCPtr, this, slotIdx, gain),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetDgain(long slotIdx, double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetDgain(swigCPtr, this, slotIdx, gain),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetFgain(long slotIdx, double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetFgain(swigCPtr, this, slotIdx, gain),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetIzone(long slotIdx, int zone) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetIzone(swigCPtr, this, slotIdx, zone),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetCloseLoopRampRate(long slotIdx, int closeLoopRampRate) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetCloseLoopRampRate(swigCPtr, this,
        slotIdx, closeLoopRampRate), true);
  }

  public SWIGTYPE_p_CTR_Code SetSensorPosition(int pos) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetSensorPosition(swigCPtr, this, pos),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetForwardSoftLimit(int forwardLimit) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetForwardSoftLimit(swigCPtr, this,
        forwardLimit), true);
  }

  public SWIGTYPE_p_CTR_Code SetReverseSoftLimit(int reverseLimit) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetReverseSoftLimit(swigCPtr, this,
        reverseLimit), true);
  }

  public SWIGTYPE_p_CTR_Code SetForwardSoftEnable(int enable) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetForwardSoftEnable(swigCPtr, this,
        enable), true);
  }

  public SWIGTYPE_p_CTR_Code SetReverseSoftEnable(int enable) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetReverseSoftEnable(swigCPtr, this,
        enable), true);
  }

  public SWIGTYPE_p_CTR_Code GetPgain(long slotIdx, SWIGTYPE_p_double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetPgain(swigCPtr, this, slotIdx,
        SWIGTYPE_p_double.getCPtr(gain)), true);
  }

  public SWIGTYPE_p_CTR_Code GetIgain(long slotIdx, SWIGTYPE_p_double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetIgain(swigCPtr, this, slotIdx,
        SWIGTYPE_p_double.getCPtr(gain)), true);
  }

  public SWIGTYPE_p_CTR_Code GetDgain(long slotIdx, SWIGTYPE_p_double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetDgain(swigCPtr, this, slotIdx,
        SWIGTYPE_p_double.getCPtr(gain)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFgain(long slotIdx, SWIGTYPE_p_double gain) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFgain(swigCPtr, this, slotIdx,
        SWIGTYPE_p_double.getCPtr(gain)), true);
  }

  public SWIGTYPE_p_CTR_Code GetIzone(long slotIdx, SWIGTYPE_p_int zone) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetIzone(swigCPtr, this, slotIdx,
        SWIGTYPE_p_int.getCPtr(zone)), true);
  }

  public SWIGTYPE_p_CTR_Code GetCloseLoopRampRate(long slotIdx, SWIGTYPE_p_int closeLoopRampRate) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetCloseLoopRampRate(swigCPtr, this,
        slotIdx, SWIGTYPE_p_int.getCPtr(closeLoopRampRate)), true);
  }

  public SWIGTYPE_p_CTR_Code GetForwardSoftLimit(SWIGTYPE_p_int forwardLimit) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetForwardSoftLimit(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(forwardLimit)), true);
  }

  public SWIGTYPE_p_CTR_Code GetReverseSoftLimit(SWIGTYPE_p_int reverseLimit) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetReverseSoftLimit(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(reverseLimit)), true);
  }

  public SWIGTYPE_p_CTR_Code GetForwardSoftEnable(SWIGTYPE_p_int enable) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetForwardSoftEnable(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(enable)), true);
  }

  public SWIGTYPE_p_CTR_Code GetReverseSoftEnable(SWIGTYPE_p_int enable) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetReverseSoftEnable(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(enable)), true);
  }

  public SWIGTYPE_p_CTR_Code SetStatusFrameRate(long frameEnum, long periodMs) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetStatusFrameRate(swigCPtr, this,
        frameEnum, periodMs), true);
  }

  public SWIGTYPE_p_CTR_Code ClearStickyFaults() {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_ClearStickyFaults(swigCPtr, this), true);
  }

  public SWIGTYPE_p_CTR_Code GetFault_OverTemp(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFault_OverTemp(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFault_UnderVoltage(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFault_UnderVoltage(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFault_ForLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFault_ForLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFault_RevLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFault_RevLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFault_HardwareFailure(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFault_HardwareFailure(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFault_ForSoftLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFault_ForSoftLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFault_RevSoftLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFault_RevSoftLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetStckyFault_OverTemp(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetStckyFault_OverTemp(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetStckyFault_UnderVoltage(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetStckyFault_UnderVoltage(swigCPtr,
        this, SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetStckyFault_ForLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetStckyFault_ForLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetStckyFault_RevLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetStckyFault_RevLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetStckyFault_ForSoftLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetStckyFault_ForSoftLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetStckyFault_RevSoftLim(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetStckyFault_RevSoftLim(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetAppliedThrottle(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetAppliedThrottle(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetCloseLoopErr(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetCloseLoopErr(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFeedbackDeviceSelect(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFeedbackDeviceSelect(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetModeSelect(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetModeSelect(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetLimitSwitchEn(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetLimitSwitchEn(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetLimitSwitchClosedFor(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetLimitSwitchClosedFor(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetLimitSwitchClosedRev(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetLimitSwitchClosedRev(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetSensorPosition(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetSensorPosition(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetSensorVelocity(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetSensorVelocity(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetCurrent(SWIGTYPE_p_double param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetCurrent(swigCPtr, this,
        SWIGTYPE_p_double.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetBrakeIsEnabled(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetBrakeIsEnabled(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetEncPosition(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetEncPosition(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetEncVel(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetEncVel(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetEncIndexRiseEvents(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetEncIndexRiseEvents(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetQuadApin(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetQuadApin(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetQuadBpin(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetQuadBpin(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetQuadIdxpin(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetQuadIdxpin(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetAnalogInWithOv(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetAnalogInWithOv(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetAnalogInVel(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetAnalogInVel(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetTemp(SWIGTYPE_p_double param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetTemp(swigCPtr, this,
        SWIGTYPE_p_double.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetBatteryV(SWIGTYPE_p_double param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetBatteryV(swigCPtr, this,
        SWIGTYPE_p_double.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetResetCount(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetResetCount(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetResetFlags(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetResetFlags(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code GetFirmVers(SWIGTYPE_p_int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_GetFirmVers(swigCPtr, this,
        SWIGTYPE_p_int.getCPtr(param)), true);
  }

  public SWIGTYPE_p_CTR_Code SetDemand(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetDemand(swigCPtr, this, param), true);
  }

  public SWIGTYPE_p_CTR_Code SetOverrideLimitSwitchEn(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetOverrideLimitSwitchEn(swigCPtr, this,
        param), true);
  }

  public SWIGTYPE_p_CTR_Code SetFeedbackDeviceSelect(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetFeedbackDeviceSelect(swigCPtr, this,
        param), true);
  }

  public SWIGTYPE_p_CTR_Code SetRevMotDuringCloseLoopEn(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetRevMotDuringCloseLoopEn(swigCPtr,
        this, param), true);
  }

  public SWIGTYPE_p_CTR_Code SetOverrideBrakeType(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetOverrideBrakeType(swigCPtr, this,
        param), true);
  }

  public SWIGTYPE_p_CTR_Code SetModeSelect(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetModeSelect(swigCPtr, this, param),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetProfileSlotSelect(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetProfileSlotSelect(swigCPtr, this,
        param), true);
  }

  public SWIGTYPE_p_CTR_Code SetRampThrottle(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetRampThrottle(swigCPtr, this, param),
        true);
  }

  public SWIGTYPE_p_CTR_Code SetRevFeedbackSensor(int param) {
    return new SWIGTYPE_p_CTR_Code(CanTalonJNI.CanTalonSRX_SetRevFeedbackSensor(swigCPtr, this,
        param), true);
  }

  public final static int kDefaultControlPeriodMs = CanTalonJNI
      .CanTalonSRX_kDefaultControlPeriodMs_get();
  public final static int kMode_DutyCycle = CanTalonJNI.CanTalonSRX_kMode_DutyCycle_get();
  public final static int kMode_PositionCloseLoop = CanTalonJNI
      .CanTalonSRX_kMode_PositionCloseLoop_get();
  public final static int kMode_VelocityCloseLoop = CanTalonJNI
      .CanTalonSRX_kMode_VelocityCloseLoop_get();
  public final static int kMode_CurrentCloseLoop = CanTalonJNI
      .CanTalonSRX_kMode_CurrentCloseLoop_get();
  public final static int kMode_VoltCompen = CanTalonJNI.CanTalonSRX_kMode_VoltCompen_get();
  public final static int kMode_SlaveFollower = CanTalonJNI.CanTalonSRX_kMode_SlaveFollower_get();
  public final static int kMode_NoDrive = CanTalonJNI.CanTalonSRX_kMode_NoDrive_get();
  public final static int kLimitSwitchOverride_UseDefaultsFromFlash = CanTalonJNI
      .CanTalonSRX_kLimitSwitchOverride_UseDefaultsFromFlash_get();
  public final static int kLimitSwitchOverride_DisableFwd_DisableRev = CanTalonJNI
      .CanTalonSRX_kLimitSwitchOverride_DisableFwd_DisableRev_get();
  public final static int kLimitSwitchOverride_DisableFwd_EnableRev = CanTalonJNI
      .CanTalonSRX_kLimitSwitchOverride_DisableFwd_EnableRev_get();
  public final static int kLimitSwitchOverride_EnableFwd_DisableRev = CanTalonJNI
      .CanTalonSRX_kLimitSwitchOverride_EnableFwd_DisableRev_get();
  public final static int kLimitSwitchOverride_EnableFwd_EnableRev = CanTalonJNI
      .CanTalonSRX_kLimitSwitchOverride_EnableFwd_EnableRev_get();
  public final static int kBrakeOverride_UseDefaultsFromFlash = CanTalonJNI
      .CanTalonSRX_kBrakeOverride_UseDefaultsFromFlash_get();
  public final static int kBrakeOverride_OverrideCoast = CanTalonJNI
      .CanTalonSRX_kBrakeOverride_OverrideCoast_get();
  public final static int kBrakeOverride_OverrideBrake = CanTalonJNI
      .CanTalonSRX_kBrakeOverride_OverrideBrake_get();
  public final static int kFeedbackDev_DigitalQuadEnc = CanTalonJNI
      .CanTalonSRX_kFeedbackDev_DigitalQuadEnc_get();
  public final static int kFeedbackDev_AnalogPot = CanTalonJNI
      .CanTalonSRX_kFeedbackDev_AnalogPot_get();
  public final static int kFeedbackDev_AnalogEncoder = CanTalonJNI
      .CanTalonSRX_kFeedbackDev_AnalogEncoder_get();
  public final static int kFeedbackDev_CountEveryRisingEdge = CanTalonJNI
      .CanTalonSRX_kFeedbackDev_CountEveryRisingEdge_get();
  public final static int kFeedbackDev_CountEveryFallingEdge = CanTalonJNI
      .CanTalonSRX_kFeedbackDev_CountEveryFallingEdge_get();
  public final static int kFeedbackDev_PosIsPulseWidth = CanTalonJNI
      .CanTalonSRX_kFeedbackDev_PosIsPulseWidth_get();
  public final static int kProfileSlotSelect_Slot0 = CanTalonJNI
      .CanTalonSRX_kProfileSlotSelect_Slot0_get();
  public final static int kProfileSlotSelect_Slot1 = CanTalonJNI
      .CanTalonSRX_kProfileSlotSelect_Slot1_get();
  public final static int kStatusFrame_General = CanTalonJNI.CanTalonSRX_kStatusFrame_General_get();
  public final static int kStatusFrame_Feedback = CanTalonJNI
      .CanTalonSRX_kStatusFrame_Feedback_get();
  public final static int kStatusFrame_Encoder = CanTalonJNI.CanTalonSRX_kStatusFrame_Encoder_get();
  public final static int kStatusFrame_AnalogTempVbat = CanTalonJNI
      .CanTalonSRX_kStatusFrame_AnalogTempVbat_get();

  public final static class param_t {
    public final static CanTalonSRX.param_t eProfileParamSlot0_P = new CanTalonSRX.param_t(
        "eProfileParamSlot0_P", CanTalonJNI.CanTalonSRX_eProfileParamSlot0_P_get());
    public final static CanTalonSRX.param_t eProfileParamSlot0_I = new CanTalonSRX.param_t(
        "eProfileParamSlot0_I", CanTalonJNI.CanTalonSRX_eProfileParamSlot0_I_get());
    public final static CanTalonSRX.param_t eProfileParamSlot0_D = new CanTalonSRX.param_t(
        "eProfileParamSlot0_D", CanTalonJNI.CanTalonSRX_eProfileParamSlot0_D_get());
    public final static CanTalonSRX.param_t eProfileParamSlot0_F = new CanTalonSRX.param_t(
        "eProfileParamSlot0_F", CanTalonJNI.CanTalonSRX_eProfileParamSlot0_F_get());
    public final static CanTalonSRX.param_t eProfileParamSlot0_IZone = new CanTalonSRX.param_t(
        "eProfileParamSlot0_IZone", CanTalonJNI.CanTalonSRX_eProfileParamSlot0_IZone_get());
    public final static CanTalonSRX.param_t eProfileParamSlot0_CloseLoopRampRate =
        new CanTalonSRX.param_t("eProfileParamSlot0_CloseLoopRampRate",
            CanTalonJNI.CanTalonSRX_eProfileParamSlot0_CloseLoopRampRate_get());
    public final static CanTalonSRX.param_t eProfileParamSlot1_P = new CanTalonSRX.param_t(
        "eProfileParamSlot1_P", CanTalonJNI.CanTalonSRX_eProfileParamSlot1_P_get());
    public final static CanTalonSRX.param_t eProfileParamSlot1_I = new CanTalonSRX.param_t(
        "eProfileParamSlot1_I", CanTalonJNI.CanTalonSRX_eProfileParamSlot1_I_get());
    public final static CanTalonSRX.param_t eProfileParamSlot1_D = new CanTalonSRX.param_t(
        "eProfileParamSlot1_D", CanTalonJNI.CanTalonSRX_eProfileParamSlot1_D_get());
    public final static CanTalonSRX.param_t eProfileParamSlot1_F = new CanTalonSRX.param_t(
        "eProfileParamSlot1_F", CanTalonJNI.CanTalonSRX_eProfileParamSlot1_F_get());
    public final static CanTalonSRX.param_t eProfileParamSlot1_IZone = new CanTalonSRX.param_t(
        "eProfileParamSlot1_IZone", CanTalonJNI.CanTalonSRX_eProfileParamSlot1_IZone_get());
    public final static CanTalonSRX.param_t eProfileParamSlot1_CloseLoopRampRate =
        new CanTalonSRX.param_t("eProfileParamSlot1_CloseLoopRampRate",
            CanTalonJNI.CanTalonSRX_eProfileParamSlot1_CloseLoopRampRate_get());
    public final static CanTalonSRX.param_t eProfileParamSoftLimitForThreshold =
        new CanTalonSRX.param_t("eProfileParamSoftLimitForThreshold",
            CanTalonJNI.CanTalonSRX_eProfileParamSoftLimitForThreshold_get());
    public final static CanTalonSRX.param_t eProfileParamSoftLimitRevThreshold =
        new CanTalonSRX.param_t("eProfileParamSoftLimitRevThreshold",
            CanTalonJNI.CanTalonSRX_eProfileParamSoftLimitRevThreshold_get());
    public final static CanTalonSRX.param_t eProfileParamSoftLimitForEnable =
        new CanTalonSRX.param_t("eProfileParamSoftLimitForEnable",
            CanTalonJNI.CanTalonSRX_eProfileParamSoftLimitForEnable_get());
    public final static CanTalonSRX.param_t eProfileParamSoftLimitRevEnable =
        new CanTalonSRX.param_t("eProfileParamSoftLimitRevEnable",
            CanTalonJNI.CanTalonSRX_eProfileParamSoftLimitRevEnable_get());
    public final static CanTalonSRX.param_t eOnBoot_BrakeMode = new CanTalonSRX.param_t(
        "eOnBoot_BrakeMode", CanTalonJNI.CanTalonSRX_eOnBoot_BrakeMode_get());
    public final static CanTalonSRX.param_t eOnBoot_LimitSwitch_Forward_NormallyClosed =
        new CanTalonSRX.param_t("eOnBoot_LimitSwitch_Forward_NormallyClosed",
            CanTalonJNI.CanTalonSRX_eOnBoot_LimitSwitch_Forward_NormallyClosed_get());
    public final static CanTalonSRX.param_t eOnBoot_LimitSwitch_Reverse_NormallyClosed =
        new CanTalonSRX.param_t("eOnBoot_LimitSwitch_Reverse_NormallyClosed",
            CanTalonJNI.CanTalonSRX_eOnBoot_LimitSwitch_Reverse_NormallyClosed_get());
    public final static CanTalonSRX.param_t eOnBoot_LimitSwitch_Forward_Disable =
        new CanTalonSRX.param_t("eOnBoot_LimitSwitch_Forward_Disable",
            CanTalonJNI.CanTalonSRX_eOnBoot_LimitSwitch_Forward_Disable_get());
    public final static CanTalonSRX.param_t eOnBoot_LimitSwitch_Reverse_Disable =
        new CanTalonSRX.param_t("eOnBoot_LimitSwitch_Reverse_Disable",
            CanTalonJNI.CanTalonSRX_eOnBoot_LimitSwitch_Reverse_Disable_get());
    public final static CanTalonSRX.param_t eFault_OverTemp = new CanTalonSRX.param_t(
        "eFault_OverTemp", CanTalonJNI.CanTalonSRX_eFault_OverTemp_get());
    public final static CanTalonSRX.param_t eFault_UnderVoltage = new CanTalonSRX.param_t(
        "eFault_UnderVoltage", CanTalonJNI.CanTalonSRX_eFault_UnderVoltage_get());
    public final static CanTalonSRX.param_t eFault_ForLim = new CanTalonSRX.param_t(
        "eFault_ForLim", CanTalonJNI.CanTalonSRX_eFault_ForLim_get());
    public final static CanTalonSRX.param_t eFault_RevLim = new CanTalonSRX.param_t(
        "eFault_RevLim", CanTalonJNI.CanTalonSRX_eFault_RevLim_get());
    public final static CanTalonSRX.param_t eFault_HardwareFailure = new CanTalonSRX.param_t(
        "eFault_HardwareFailure", CanTalonJNI.CanTalonSRX_eFault_HardwareFailure_get());
    public final static CanTalonSRX.param_t eFault_ForSoftLim = new CanTalonSRX.param_t(
        "eFault_ForSoftLim", CanTalonJNI.CanTalonSRX_eFault_ForSoftLim_get());
    public final static CanTalonSRX.param_t eFault_RevSoftLim = new CanTalonSRX.param_t(
        "eFault_RevSoftLim", CanTalonJNI.CanTalonSRX_eFault_RevSoftLim_get());
    public final static CanTalonSRX.param_t eStckyFault_OverTemp = new CanTalonSRX.param_t(
        "eStckyFault_OverTemp", CanTalonJNI.CanTalonSRX_eStckyFault_OverTemp_get());
    public final static CanTalonSRX.param_t eStckyFault_UnderVoltage = new CanTalonSRX.param_t(
        "eStckyFault_UnderVoltage", CanTalonJNI.CanTalonSRX_eStckyFault_UnderVoltage_get());
    public final static CanTalonSRX.param_t eStckyFault_ForLim = new CanTalonSRX.param_t(
        "eStckyFault_ForLim", CanTalonJNI.CanTalonSRX_eStckyFault_ForLim_get());
    public final static CanTalonSRX.param_t eStckyFault_RevLim = new CanTalonSRX.param_t(
        "eStckyFault_RevLim", CanTalonJNI.CanTalonSRX_eStckyFault_RevLim_get());
    public final static CanTalonSRX.param_t eStckyFault_ForSoftLim = new CanTalonSRX.param_t(
        "eStckyFault_ForSoftLim", CanTalonJNI.CanTalonSRX_eStckyFault_ForSoftLim_get());
    public final static CanTalonSRX.param_t eStckyFault_RevSoftLim = new CanTalonSRX.param_t(
        "eStckyFault_RevSoftLim", CanTalonJNI.CanTalonSRX_eStckyFault_RevSoftLim_get());
    public final static CanTalonSRX.param_t eAppliedThrottle = new CanTalonSRX.param_t(
        "eAppliedThrottle", CanTalonJNI.CanTalonSRX_eAppliedThrottle_get());
    public final static CanTalonSRX.param_t eCloseLoopErr = new CanTalonSRX.param_t(
        "eCloseLoopErr", CanTalonJNI.CanTalonSRX_eCloseLoopErr_get());
    public final static CanTalonSRX.param_t eFeedbackDeviceSelect = new CanTalonSRX.param_t(
        "eFeedbackDeviceSelect", CanTalonJNI.CanTalonSRX_eFeedbackDeviceSelect_get());
    public final static CanTalonSRX.param_t eRevMotDuringCloseLoopEn = new CanTalonSRX.param_t(
        "eRevMotDuringCloseLoopEn", CanTalonJNI.CanTalonSRX_eRevMotDuringCloseLoopEn_get());
    public final static CanTalonSRX.param_t eModeSelect = new CanTalonSRX.param_t("eModeSelect",
        CanTalonJNI.CanTalonSRX_eModeSelect_get());
    public final static CanTalonSRX.param_t eProfileSlotSelect = new CanTalonSRX.param_t(
        "eProfileSlotSelect", CanTalonJNI.CanTalonSRX_eProfileSlotSelect_get());
    public final static CanTalonSRX.param_t eRampThrottle = new CanTalonSRX.param_t(
        "eRampThrottle", CanTalonJNI.CanTalonSRX_eRampThrottle_get());
    public final static CanTalonSRX.param_t eRevFeedbackSensor = new CanTalonSRX.param_t(
        "eRevFeedbackSensor", CanTalonJNI.CanTalonSRX_eRevFeedbackSensor_get());
    public final static CanTalonSRX.param_t eLimitSwitchEn = new CanTalonSRX.param_t(
        "eLimitSwitchEn", CanTalonJNI.CanTalonSRX_eLimitSwitchEn_get());
    public final static CanTalonSRX.param_t eLimitSwitchClosedFor = new CanTalonSRX.param_t(
        "eLimitSwitchClosedFor", CanTalonJNI.CanTalonSRX_eLimitSwitchClosedFor_get());
    public final static CanTalonSRX.param_t eLimitSwitchClosedRev = new CanTalonSRX.param_t(
        "eLimitSwitchClosedRev", CanTalonJNI.CanTalonSRX_eLimitSwitchClosedRev_get());
    public final static CanTalonSRX.param_t eSensorPosition = new CanTalonSRX.param_t(
        "eSensorPosition", CanTalonJNI.CanTalonSRX_eSensorPosition_get());
    public final static CanTalonSRX.param_t eSensorVelocity = new CanTalonSRX.param_t(
        "eSensorVelocity", CanTalonJNI.CanTalonSRX_eSensorVelocity_get());
    public final static CanTalonSRX.param_t eCurrent = new CanTalonSRX.param_t("eCurrent",
        CanTalonJNI.CanTalonSRX_eCurrent_get());
    public final static CanTalonSRX.param_t eBrakeIsEnabled = new CanTalonSRX.param_t(
        "eBrakeIsEnabled", CanTalonJNI.CanTalonSRX_eBrakeIsEnabled_get());
    public final static CanTalonSRX.param_t eEncPosition = new CanTalonSRX.param_t("eEncPosition",
        CanTalonJNI.CanTalonSRX_eEncPosition_get());
    public final static CanTalonSRX.param_t eEncVel = new CanTalonSRX.param_t("eEncVel",
        CanTalonJNI.CanTalonSRX_eEncVel_get());
    public final static CanTalonSRX.param_t eEncIndexRiseEvents = new CanTalonSRX.param_t(
        "eEncIndexRiseEvents", CanTalonJNI.CanTalonSRX_eEncIndexRiseEvents_get());
    public final static CanTalonSRX.param_t eQuadApin = new CanTalonSRX.param_t("eQuadApin",
        CanTalonJNI.CanTalonSRX_eQuadApin_get());
    public final static CanTalonSRX.param_t eQuadBpin = new CanTalonSRX.param_t("eQuadBpin",
        CanTalonJNI.CanTalonSRX_eQuadBpin_get());
    public final static CanTalonSRX.param_t eQuadIdxpin = new CanTalonSRX.param_t("eQuadIdxpin",
        CanTalonJNI.CanTalonSRX_eQuadIdxpin_get());
    public final static CanTalonSRX.param_t eAnalogInWithOv = new CanTalonSRX.param_t(
        "eAnalogInWithOv", CanTalonJNI.CanTalonSRX_eAnalogInWithOv_get());
    public final static CanTalonSRX.param_t eAnalogInVel = new CanTalonSRX.param_t("eAnalogInVel",
        CanTalonJNI.CanTalonSRX_eAnalogInVel_get());
    public final static CanTalonSRX.param_t eTemp = new CanTalonSRX.param_t("eTemp",
        CanTalonJNI.CanTalonSRX_eTemp_get());
    public final static CanTalonSRX.param_t eBatteryV = new CanTalonSRX.param_t("eBatteryV",
        CanTalonJNI.CanTalonSRX_eBatteryV_get());
    public final static CanTalonSRX.param_t eResetCount = new CanTalonSRX.param_t("eResetCount",
        CanTalonJNI.CanTalonSRX_eResetCount_get());
    public final static CanTalonSRX.param_t eResetFlags = new CanTalonSRX.param_t("eResetFlags",
        CanTalonJNI.CanTalonSRX_eResetFlags_get());
    public final static CanTalonSRX.param_t eFirmVers = new CanTalonSRX.param_t("eFirmVers",
        CanTalonJNI.CanTalonSRX_eFirmVers_get());
    public final static CanTalonSRX.param_t eSettingsChanged = new CanTalonSRX.param_t(
        "eSettingsChanged", CanTalonJNI.CanTalonSRX_eSettingsChanged_get());
    public final static CanTalonSRX.param_t eQuadFilterEn = new CanTalonSRX.param_t(
        "eQuadFilterEn", CanTalonJNI.CanTalonSRX_eQuadFilterEn_get());
    public final static CanTalonSRX.param_t ePidIaccum = new CanTalonSRX.param_t("ePidIaccum",
        CanTalonJNI.CanTalonSRX_ePidIaccum_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static param_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0
          && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + param_t.class + " with value " + swigValue);
    }

    private param_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private param_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue + 1;
    }

    private param_t(String swigName, param_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue + 1;
    }

    private static param_t[] swigValues = {eProfileParamSlot0_P, eProfileParamSlot0_I,
        eProfileParamSlot0_D, eProfileParamSlot0_F, eProfileParamSlot0_IZone,
        eProfileParamSlot0_CloseLoopRampRate, eProfileParamSlot1_P, eProfileParamSlot1_I,
        eProfileParamSlot1_D, eProfileParamSlot1_F, eProfileParamSlot1_IZone,
        eProfileParamSlot1_CloseLoopRampRate, eProfileParamSoftLimitForThreshold,
        eProfileParamSoftLimitRevThreshold, eProfileParamSoftLimitForEnable,
        eProfileParamSoftLimitRevEnable, eOnBoot_BrakeMode,
        eOnBoot_LimitSwitch_Forward_NormallyClosed, eOnBoot_LimitSwitch_Reverse_NormallyClosed,
        eOnBoot_LimitSwitch_Forward_Disable, eOnBoot_LimitSwitch_Reverse_Disable, eFault_OverTemp,
        eFault_UnderVoltage, eFault_ForLim, eFault_RevLim, eFault_HardwareFailure,
        eFault_ForSoftLim, eFault_RevSoftLim, eStckyFault_OverTemp, eStckyFault_UnderVoltage,
        eStckyFault_ForLim, eStckyFault_RevLim, eStckyFault_ForSoftLim, eStckyFault_RevSoftLim,
        eAppliedThrottle, eCloseLoopErr, eFeedbackDeviceSelect, eRevMotDuringCloseLoopEn,
        eModeSelect, eProfileSlotSelect, eRampThrottle, eRevFeedbackSensor, eLimitSwitchEn,
        eLimitSwitchClosedFor, eLimitSwitchClosedRev, eSensorPosition, eSensorVelocity, eCurrent,
        eBrakeIsEnabled, eEncPosition, eEncVel, eEncIndexRiseEvents, eQuadApin, eQuadBpin,
        eQuadIdxpin, eAnalogInWithOv, eAnalogInVel, eTemp, eBatteryV, eResetCount, eResetFlags,
        eFirmVers, eSettingsChanged, eQuadFilterEn, ePidIaccum};
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
