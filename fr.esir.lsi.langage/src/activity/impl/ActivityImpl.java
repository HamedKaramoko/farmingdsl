/**
 */
package activity.impl;

import activity.Activites;
import activity.Activity;
import activity.ActivityPackage;
import activity.Date;
import activity.Periodicite;
import activity.Res_Alloc;
import activity.Rule;
import exploitation.Atelier;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.ActivityImpl#getPeriodicite <em>Periodicite</em>}</li>
 *   <li>{@link activity.impl.ActivityImpl#getRes_alloc <em>Res alloc</em>}</li>
 *   <li>{@link activity.impl.ActivityImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link activity.impl.ActivityImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link activity.impl.ActivityImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link activity.impl.ActivityImpl#getAtelier <em>Atelier</em>}</li>
 *   <li>{@link activity.impl.ActivityImpl#getActivites <em>Activites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #getPeriodicite() <em>Periodicite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicite()
	 * @generated
	 * @ordered
	 */
	protected static final Periodicite PERIODICITE_EDEFAULT = Periodicite.HALF_DAILY;

	/**
	 * The cached value of the '{@link #getPeriodicite() <em>Periodicite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicite()
	 * @generated
	 * @ordered
	 */
	protected Periodicite periodicite = PERIODICITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRes_alloc() <em>Res alloc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes_alloc()
	 * @generated
	 * @ordered
	 */
	protected EList<Res_Alloc> res_alloc;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected Date fin;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected Date debut;

	/**
	 * The cached value of the '{@link #getAtelier() <em>Atelier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtelier()
	 * @generated
	 * @ordered
	 */
	protected EList<Atelier> atelier;

	/**
	 * The default value of the '{@link #getActivites() <em>Activites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivites()
	 * @generated
	 * @ordered
	 */
	protected static final Activites ACTIVITES_EDEFAULT = Activites.LABOUR;

	/**
	 * The cached value of the '{@link #getActivites() <em>Activites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivites()
	 * @generated
	 * @ordered
	 */
	protected Activites activites = ACTIVITES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Periodicite getPeriodicite() {
		return periodicite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicite(Periodicite newPeriodicite) {
		Periodicite oldPeriodicite = periodicite;
		periodicite = newPeriodicite == null ? PERIODICITE_EDEFAULT : newPeriodicite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY__PERIODICITE, oldPeriodicite, periodicite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Res_Alloc> getRes_alloc() {
		if (res_alloc == null) {
			res_alloc = new EObjectContainmentEList<Res_Alloc>(Res_Alloc.class, this, ActivityPackage.ACTIVITY__RES_ALLOC);
		}
		return res_alloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Rule>(Rule.class, this, ActivityPackage.ACTIVITY__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFin(Date newFin, NotificationChain msgs) {
		Date oldFin = fin;
		fin = newFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY__FIN, oldFin, newFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(Date newFin) {
		if (newFin != fin) {
			NotificationChain msgs = null;
			if (fin != null)
				msgs = ((InternalEObject)fin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY__FIN, null, msgs);
			if (newFin != null)
				msgs = ((InternalEObject)newFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY__FIN, null, msgs);
			msgs = basicSetFin(newFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY__FIN, newFin, newFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebut(Date newDebut, NotificationChain msgs) {
		Date oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY__DEBUT, oldDebut, newDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(Date newDebut) {
		if (newDebut != debut) {
			NotificationChain msgs = null;
			if (debut != null)
				msgs = ((InternalEObject)debut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY__DEBUT, null, msgs);
			if (newDebut != null)
				msgs = ((InternalEObject)newDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY__DEBUT, null, msgs);
			msgs = basicSetDebut(newDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY__DEBUT, newDebut, newDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atelier> getAtelier() {
		if (atelier == null) {
			atelier = new EObjectResolvingEList<Atelier>(Atelier.class, this, ActivityPackage.ACTIVITY__ATELIER);
		}
		return atelier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activites getActivites() {
		return activites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivites(Activites newActivites) {
		Activites oldActivites = activites;
		activites = newActivites == null ? ACTIVITES_EDEFAULT : newActivites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY__ACTIVITES, oldActivites, activites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY__RES_ALLOC:
				return ((InternalEList<?>)getRes_alloc()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ACTIVITY__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ACTIVITY__FIN:
				return basicSetFin(null, msgs);
			case ActivityPackage.ACTIVITY__DEBUT:
				return basicSetDebut(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY__PERIODICITE:
				return getPeriodicite();
			case ActivityPackage.ACTIVITY__RES_ALLOC:
				return getRes_alloc();
			case ActivityPackage.ACTIVITY__RULE:
				return getRule();
			case ActivityPackage.ACTIVITY__FIN:
				return getFin();
			case ActivityPackage.ACTIVITY__DEBUT:
				return getDebut();
			case ActivityPackage.ACTIVITY__ATELIER:
				return getAtelier();
			case ActivityPackage.ACTIVITY__ACTIVITES:
				return getActivites();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY__PERIODICITE:
				setPeriodicite((Periodicite)newValue);
				return;
			case ActivityPackage.ACTIVITY__RES_ALLOC:
				getRes_alloc().clear();
				getRes_alloc().addAll((Collection<? extends Res_Alloc>)newValue);
				return;
			case ActivityPackage.ACTIVITY__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case ActivityPackage.ACTIVITY__FIN:
				setFin((Date)newValue);
				return;
			case ActivityPackage.ACTIVITY__DEBUT:
				setDebut((Date)newValue);
				return;
			case ActivityPackage.ACTIVITY__ATELIER:
				getAtelier().clear();
				getAtelier().addAll((Collection<? extends Atelier>)newValue);
				return;
			case ActivityPackage.ACTIVITY__ACTIVITES:
				setActivites((Activites)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY__PERIODICITE:
				setPeriodicite(PERIODICITE_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY__RES_ALLOC:
				getRes_alloc().clear();
				return;
			case ActivityPackage.ACTIVITY__RULE:
				getRule().clear();
				return;
			case ActivityPackage.ACTIVITY__FIN:
				setFin((Date)null);
				return;
			case ActivityPackage.ACTIVITY__DEBUT:
				setDebut((Date)null);
				return;
			case ActivityPackage.ACTIVITY__ATELIER:
				getAtelier().clear();
				return;
			case ActivityPackage.ACTIVITY__ACTIVITES:
				setActivites(ACTIVITES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY__PERIODICITE:
				return periodicite != PERIODICITE_EDEFAULT;
			case ActivityPackage.ACTIVITY__RES_ALLOC:
				return res_alloc != null && !res_alloc.isEmpty();
			case ActivityPackage.ACTIVITY__RULE:
				return rule != null && !rule.isEmpty();
			case ActivityPackage.ACTIVITY__FIN:
				return fin != null;
			case ActivityPackage.ACTIVITY__DEBUT:
				return debut != null;
			case ActivityPackage.ACTIVITY__ATELIER:
				return atelier != null && !atelier.isEmpty();
			case ActivityPackage.ACTIVITY__ACTIVITES:
				return activites != ACTIVITES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (periodicite: ");
		result.append(periodicite);
		result.append(", activites: ");
		result.append(activites);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
